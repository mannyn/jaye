package geeks.aretotally.in;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class GeoCoordinate.
 */
public class GeoCoordinate implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The longitude. */
	private Double longitude;
	
	/** The latitude. */
	private Double latitude;
	
	/** The status. */
	private boolean status;
	
	/** The ip. */
	private String ip;
	
	/** The countrycode. */
	private String countrycode;
	
	/** The countryname. */
	private String countryname;
	
	/** The regioncode. */
	private String regioncode;
	
	/** The regionname. */
	private String regionname;
	
	/** The city. */
	private String city;
	
	/** The zipcode. */
	private String zipcode;
	
	
	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude.
	 *
	 * @param latitude the new latitude
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude.
	 *
	 * @param longitude the new longitude
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * Checks if is status.
	 *
	 * @return true, if is status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * Gets the ip.
	 *
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * Sets the ip.
	 *
	 * @param ip the new ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * Gets the countrycode.
	 *
	 * @return the countrycode
	 */
	public String getCountrycode() {
		return countrycode;
	}

	/**
	 * Sets the countrycode.
	 *
	 * @param countrycode the new countrycode
	 */
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	/**
	 * Gets the countryname.
	 *
	 * @return the countryname
	 */
	public String getCountryname() {
		return countryname;
	}

	/**
	 * Sets the countryname.
	 *
	 * @param countryname the new countryname
	 */
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	/**
	 * Gets the regioncode.
	 *
	 * @return the regioncode
	 */
	public String getRegioncode() {
		return regioncode;
	}

	/**
	 * Sets the regioncode.
	 *
	 * @param regioncode the new regioncode
	 */
	public void setRegioncode(String regioncode) {
		this.regioncode = regioncode;
	}

	/**
	 * Gets the regionname.
	 *
	 * @return the regionname
	 */
	public String getRegionname() {
		return regionname;
	}

	/**
	 * Sets the regionname.
	 *
	 * @param regionname the new regionname
	 */
	public void setRegionname(String regionname) {
		this.regionname = regionname;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the zipcode.
	 *
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * Sets the zipcode.
	 *
	 * @param zipcode the new zipcode
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GeoCoordinate [longitude=" + longitude + ", latitude="
				+ latitude + ", status=" + status + ", ip=" + ip
				+ ", countrycode=" + countrycode + ", countryname="
				+ countryname + ", regioncode=" + regioncode + ", regionname="
				+ regionname + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
}