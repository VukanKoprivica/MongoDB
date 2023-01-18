package databinding2;

import java.util.Date;

public class Races {

	private Integer raceId,year,round,circuitId;
	//private Circuit circuit;
	private String raceName,raceUrl;
	private Date raceDate;
	public Integer getRaceId() {
		return raceId;
	}
	public void setRaceId(Integer raceId) {
		this.raceId = raceId;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getRound() {
		return round;
	}
	public void setRound(Integer round) {
		this.round = round;
	}
	
	public String getRaceName() {
		return raceName;
	}
	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}
	public String getRaceUrl() {
		return raceUrl;
	}
	public void setRaceUrl(String raceUrl) {
		this.raceUrl = raceUrl;
	}
	public Date getRaceDate() {
		return raceDate;
	}
	public void setRaceDate(Date raceDate) {
		this.raceDate = raceDate;
	}
	/*
	 * public Circuit getCircuit() { return circuit; } public void
	 * setCircuit(Circuit circuit) { this.circuit = circuit; }
	 */
	public Integer getCircuitId() {
		return circuitId;
	}
	public void setCircuitId(Integer circuitId) {
		this.circuitId = circuitId;
	}
	
	
}
