package geeks.aretotally.in;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.inject.Named;
import javax.inject.Singleton;

import org.codehaus.jackson.map.ObjectMapper;
import org.cometd.bayeux.server.ServerMessage;
import org.cometd.bayeux.server.ServerSession;
import org.cometd.java.annotation.Listener;
import org.cometd.java.annotation.Service;
import org.cometd.java.annotation.Session;

/**
 * The Class HelloService.
 */
@Named
@Singleton
@Service("geoService")
public class GeoService {
	
	/** The logger. */
	private transient static Logger logger = Logger.getLogger(GeoService.class.getCanonicalName());
    
    /** The server session. */
    @Session
    private ServerSession serverSession;

    /**
     * Process hello.
     *
     * @param remote the remote
     * @param message the message
     */
    @Listener("/service/geo")
    public void processMessage(ServerSession remote, ServerMessage.Mutable message) {
    	try {
    		// Get Input
    		Map<String, Object> input = message.getDataAsMap();
    		
    		// Get Ip
    		String ip = (String)input.get("ip");
    		logger.info("Input: " + input);
    		
    		// Get Geo Coords
    		GeoCoordinate geo = this.getGeoCoordinateByIP(ip);
    		
    		// Define Output
    		Map<String, Object> output = new HashMap<String, Object>();
    		output.put("latitude", geo.getLatitude());
    		output.put("longitude", geo.getLongitude());
    		output.put("city", geo.getCity());
    		
    		// Send Output Back to Client
    		remote.deliver(serverSession, "/geo", output, null);
    		
    	} catch (Throwable t) {
    		throw new RuntimeException(t);
    	}
    }
    
    /**
     * Gets the coordinates by ip.
     *
     * @param ip the ip
     * @return the coordinates by ip
     * @throws Exception the exception
     */
    private GeoCoordinate getGeoCoordinateByIP(String ip) throws Exception {
    	ObjectMapper mapper = new ObjectMapper(); 
    	GeoCoordinate geo = mapper.readValue(new URL("http://freegeoip.appspot.com/json/" + ip), GeoCoordinate.class);
    	logger.info(ip + " -> " + geo);
    	return geo;
    }
}
