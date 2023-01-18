package databinding2;

import java.util.ArrayList;
import java.util.List;

public class Circuit {
	
	private Integer circuitId,alt;
	private Double lat,lng;
	private String circuitRef,circuitName,location,country,circuitUrl;
	private List<Races> raceList;
	
	public List<Races> getRaceList() {
		return raceList;
	}


	public void setRaceList(List<Races> raceList) {
		this.raceList = raceList;
	}


	public Circuit() {
		raceList= new ArrayList<Races>();
	}
	
	
	public Integer getCircuitId() {
		return circuitId;
	}
	public void setCircuitId(Integer circuitId) {
		this.circuitId = circuitId;
	}
	public Integer getAlt() {
		return alt;
	}
	public void setAlt(Integer alt) {
		this.alt = alt;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
	public String getCircuitRef() {
		return circuitRef;
	}
	public void setCircuitRef(String circuitRef) {
		this.circuitRef = circuitRef;
	}
	public String getCircuitName() {
		return circuitName;
	}
	public void setCircuitName(String circuitName) {
		this.circuitName = circuitName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCircuitUrl() {
		return circuitUrl;
	}
	public void setCircuitUrl(String circuitUrl) {
		this.circuitUrl = circuitUrl;
	}
	
	

}
