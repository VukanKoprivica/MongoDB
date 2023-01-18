package databinding2;



public class Results {

	private Integer resultId,number,grid,position,positionOrdered,laps,fastestLap,rank;
	//private Races race;
	private Circuit circuit;
	
	private Drivers driver;
	private Constuctors constuctor;
	private Double fastestLapSpeed,points;
	private String positionText,time,fastestLapTime;
	public Integer getResultId() {
		return resultId;
	}
	public void setResultId(Integer resultId) {
		this.resultId = resultId;
	}
	public Circuit getCircuit() {
		return circuit;
	}
	public void setCircuit(Circuit circuit) {
		this.circuit = circuit;
	}
	
	
	/*
	 * public Races getRace() { return race; } public void setRace(Races race) {
	 * this.race = race; }
	 */
	public Drivers getDriver() {
		return driver;
	}
	public void setDriver(Drivers driver) {
		this.driver = driver;
	}
	public Constuctors getConstuctor() {
		return constuctor;
	}
	public void setConstuctor(Constuctors constuctor) {
		this.constuctor = constuctor;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getGrid() {
		return grid;
	}
	public void setGrid(Integer grid) {
		this.grid = grid;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public Double getPoints() {
		return points;
	}
	public void setPoints(Double points) {
		this.points = points;
	}
	public Integer getPositionOrdered() {
		return positionOrdered;
	}
	public void setPositionOrdered(Integer positionOrdered) {
		this.positionOrdered = positionOrdered;
	}
	public Integer getLaps() {
		return laps;
	}
	public void setLaps(Integer laps) {
		this.laps = laps;
	}
	public Integer getFastestLap() {
		return fastestLap;
	}
	public void setFastestLap(Integer fastestLap) {
		this.fastestLap = fastestLap;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public Double getFastestLapSpeed() {
		return fastestLapSpeed;
	}
	public void setFastestLapSpeed(Double fastestLapSpeed) {
		this.fastestLapSpeed = fastestLapSpeed;
	}
	public String getPositionText() {
		return positionText;
	}
	public void setPositionText(String positionText) {
		this.positionText = positionText;
	}
	/*
	 * public LocalTime getTime() { return time; } public void setTime(LocalTime
	 * time) { this.time = time; } public LocalTime getFastestLapTime() { return
	 * fastestLapTime; } public void setFastestLapTime(LocalTime fastestLapTime) {
	 * this.fastestLapTime = fastestLapTime; }
	 */
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFastestLapTime() {
		return fastestLapTime;
	}
	public void setFastestLapTime(String fastestLapTime) {
		this.fastestLapTime = fastestLapTime;
	}
	
	
	
	
}
