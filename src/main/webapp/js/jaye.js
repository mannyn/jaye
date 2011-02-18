(function($)
{
    var jaye = $.cometd;
    
    var jayeGeoStatsClient;
    jQuery(function() {
      jayeGeoStatsClient = new JayeGeoStatsClient();
      
      $(window).resize(function() {
        jayeGeoStatsClient.viewDidResize();
      });
    });

    $(document).ready(function()
    {
        function _connectionEstablished()
        {
            // $('#body').append('<div>Jaye Shoutout Connection Established</div>');
        }

        function _connectionBroken()
        {
            // $('#body').append('<div>Jaye Shoutout Connection Broken</div>');
        }

        function _connectionClosed()
        {
            // $('#body').append('<div>Jaye Shoutout Connection Closed</div>');
        }

        // Function that manages the connection status with the Bayeux server
        var _connected = false;
        function _metaConnect(message)
        {
            if (jaye.isDisconnected())
            {
                _connected = false;
                _connectionClosed();
                return;
            }

            var wasConnected = _connected;
            _connected = message.successful === true;
            if (!wasConnected && _connected)
            {
                _connectionEstablished();
            }
            else if (wasConnected && !_connected)
            {
                _connectionBroken();
            }
        }

        // Function invoked when first contacting the server and
        // when the server has lost the state of this client
        function _metaHandshake(handshake)
        {
            if (handshake.successful === true)
            {
            	jaye.batch(function()
                {
            		jaye.subscribe('/geo', function(message)
                    {
                        //$('#body').append('<div>City: ' + message.data.city + ', Latitude: ' + message.data.latitude + ', Longitude: ' + message.data.longitude + '</div>');
            			jayeGeoStatsClient.drawMarker(message.data);
                    });
                    
                    $.get(
    					"http://jsonip.appspot.com/",
    					function(data) { jaye.publish('/service/geo', data); }
					);
					
                });
            }
        }

        // Disconnect when the page unloads
        $(window).unload(function()
        {
        	jaye.disconnect(true);
        });

        var cometURL = location.protocol + "//" + location.host + "/jayed";
        jaye.configure({
            url: cometURL,
            logLevel: 'info'
        });

        jaye.addListener('/meta/handshake', _metaHandshake);
        jaye.addListener('/meta/connect', _metaConnect);

        jaye.handshake();
    });
})(jQuery);