package geeks.aretotally.in.jaye;

import java.io.Serializable;

class GeoCoordinate extends Serializable {

	var longitude: java.util.Double = _
	var latitude: java.util.Double = _
	var status: Boolean = _
	var ip: String = _
	var countrycode: String = _
	var countryname: String = _
	var regioncode: String = _
	var regionname: String = _
	var city: String = _
	var zipcode: String = _
	
	def toString: String() = {
		return "GeoCoordinate [longitude=" + longitude + ", latitude="
				+ latitude + ", status=" + status + ", ip=" + ip
				+ ", countrycode=" + countrycode + ", countryname="
				+ countryname + ", regioncode=" + regioncode + ", regionname="
				+ regionname + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
}