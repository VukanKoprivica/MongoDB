package databinding2;

import java.util.Date;

public class Drivers {
	
	private Integer driverId,driverNumber; 
	private String 	driverRef,driverCode,foreName,sureName,nationality,driverUrl;
	private Date driverBirth;
	
	
	public Integer getDriverId() {
		return driverId;
	}
	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}
	public Integer getDriverNumber() {
		return driverNumber;
	}
	public void setDriverNumber(Integer driverNumber) {
		this.driverNumber = driverNumber;
	}
	public String getDriverRef() {
		return driverRef;
	}
	public void setDriverRef(String driverRef) {
		this.driverRef = driverRef;
	}
	public String getDriverCode() {
		return driverCode;
	}
	public void setDriverCode(String driverCode) {
		this.driverCode = driverCode;
	}
	public String getForeName() {
		return foreName;
	}
	public void setForeName(String foreName) {
		this.foreName = foreName;
	}
	public String getSureName() {
		return sureName;
	}
	public void setSureName(String sureName) {
		this.sureName = sureName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDriverUrl() {
		return driverUrl;
	}
	public void setDriverUrl(String driverUrl) {
		this.driverUrl = driverUrl;
	}
	public Date getDriverBirth() {
		return driverBirth;
	}
	public void setDriverBirth(Date driverBirth) {
		this.driverBirth = driverBirth;
	}
	
	
	
	
}
