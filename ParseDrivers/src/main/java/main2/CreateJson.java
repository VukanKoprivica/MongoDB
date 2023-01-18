package main2;

import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import databinding2.Circuit;
import databinding2.Constuctors;
import databinding2.Drivers;
import databinding2.Races;
import databinding2.Results;

public class CreateJson {
	
	public static List<Results> createJson(){
		try {
			
			FileReader fileReader = new FileReader("res/drivers.csv");
			
			CSVReader csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();
			
			int i = 1;
			
			String[] nextRecord;
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat DateAndTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:mm:ss.SSS");
			
			
			
			List<Drivers> drivers = new ArrayList<Drivers>();
			
			List<Circuit> circuits = new ArrayList<Circuit>();
			
			List<Constuctors> constructors = new ArrayList<Constuctors>();
			
		
			
			while((nextRecord= csvReader.readNext()) !=null) {
				
				System.out.println("line:"+i);
				System.out.println("line length" +nextRecord.length);
				Drivers driver = new Drivers();
				
				Integer driverId = Integer.parseInt(nextRecord[0]);
				driver.setDriverId(driverId);
				System.out.println(driver.getDriverId());
				
				String driverRef = nextRecord[1];
				driver.setDriverRef(driverRef);
				System.out.println(driver.getDriverRef());
				
				try {
					Integer driverNumber = Integer.parseInt(nextRecord[2]);
					driver.setDriverNumber(driverNumber);
					System.out.println(driver.getDriverNumber());
				} catch (Exception e) {
					// TODO: handle exception
					driver.setDriverNumber(0);
					System.out.println(driver.getDriverNumber());
				}
				
				String driverCode = nextRecord[3];
				driver.setDriverCode(driverCode);
				System.out.println(driver.getDriverCode());
				
				String forename = nextRecord[4];
				driver.setForeName(forename);
				System.out.println(driver.getForeName());
				
				String surename = nextRecord[5];
				driver.setSureName(surename);
				System.out.println(driver.getSureName());
				
				Date dateBirth = sdf.parse(nextRecord[6]);
				driver.setDriverBirth(dateBirth);
				System.out.println(driver.getDriverBirth());
				
				String nationality = nextRecord[7];
				driver.setNationality(nationality);
				System.out.println(driver.getNationality());
				
				String url = nextRecord[8];
				driver.setDriverUrl(url);
				System.out.println(driver.getDriverUrl());
				
				
				drivers.add(driver);
				System.out.println("----------");
				i++;

			}
			
			
				fileReader = new FileReader("res/constructors.csv");
			
				csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();
			
				i=1;
			
				nextRecord=null;
			
				while((nextRecord= csvReader.readNext()) !=null) {
				
				System.out.println("line:"+i);
				System.out.println("line length" +nextRecord.length);
				Constuctors c = new Constuctors();
				
				
				Integer conId = Integer.parseInt(nextRecord[0]);
				c.setConstuctroId(conId);
				System.out.println(c.getConstuctroId());
				
				String conRef = nextRecord[1];
				c.setConstructroRef(conRef);
				System.out.println(c.getConstructroRef());
				
				String conName = nextRecord[2];
				c.setConstructorName(conName);
				System.out.println(c.getConstructorName());
				
				String conNationality = nextRecord[3];
				c.setConstuctroNationality(conNationality);
				System.out.println(c.getConstuctroNationality());
				
				String url = nextRecord[4];
				c.setConstructorUrl(url);
				System.out.println(c.getConstructorUrl());
				
				constructors.add(c);
				System.out.println("----------");
				i++;
			}
			
				

				fileReader = new FileReader("res/circuits.csv");
			
				csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();
			
				i=1;
			
				nextRecord=null;
			
				while((nextRecord= csvReader.readNext()) !=null) {
				
				System.out.println("line:"+i);
				System.out.println("line length" +nextRecord.length);
				Circuit c = new Circuit();
				
				Integer id = Integer.parseInt(nextRecord[0]);
				c.setCircuitId(id);
				System.out.println(c.getCircuitId());
				
				String ref = nextRecord[1];
				c.setCircuitRef(ref);
				System.out.println(c.getCircuitRef());
				
				String name = nextRecord[2];
				c.setCircuitName(name);
				System.out.println(c.getCircuitName());
				
				String location = nextRecord[3];
				c.setLocation(location);
				System.out.println(c.getLocation());
				
				String country = nextRecord[4];
				c.setCountry(country);
				System.out.println(c.getCountry());
				
				Double lat = Double.parseDouble(nextRecord[5]);
				c.setLat(lat);
				System.out.println(c.getLat());
				
				Double lgt = Double.parseDouble(nextRecord[6]);
				c.setLng(lgt);
				System.out.println(c.getLng());
				
				try {
					Integer alt = Integer.parseInt(nextRecord[7]);
					c.setAlt(alt);
					System.out.println(c.getAlt());
				} catch (Exception e) {
					c.setAlt(0);
					System.out.println(c.getAlt());
				}
				
				String url = nextRecord[8];
				c.setCircuitUrl(url);
				System.out.println(c.getCircuitUrl());
				
				circuits.add(c);
				System.out.println("----------");
				i++;
				
	
			}
				
				fileReader = new FileReader("res/races.csv");
				
				csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();
			
				i=1;
			
				nextRecord=null;
				List<Races> races = new ArrayList<Races>();
			
				while((nextRecord= csvReader.readNext()) !=null) {
				
				System.out.println("line:"+i);
				System.out.println("line length" +nextRecord.length);
				Races race = new Races();
				
				Integer id = Integer.parseInt(nextRecord[0]);
				race.setRaceId(id);
				System.out.println(race.getRaceId());
				
				Integer year = Integer.parseInt(nextRecord[1]);
				race.setYear(year);
				System.out.println(race.getYear());
				
				Integer round = Integer.parseInt(nextRecord[2]);
				race.setRound(round);
				System.out.println(race.getRound());
				
				
				Integer circId = Integer.parseInt(nextRecord[3]);
				race.setCircuitId(circId);
				System.out.println(race.getCircuitId());
				
				/*
				 * Integer circId = Integer.parseInt(nextRecord[3]); for(Circuit cir:circuits) {
				 * if(cir.getCircuitId()==circId) { race.setCircuit(cir);
				 * 
				 * System.out.println(race.getCircuit().getCircuitName()); break; } }
				 */
				 
				
				String name = nextRecord[4];
				race.setRaceName(name);
				System.out.println(race.getRaceName());
				
				try {
					Date date = DateAndTime.parse(nextRecord[5]+" "+nextRecord[6]);
					race.setRaceDate(date);
					System.out.println(race.getRaceDate());
				} catch (Exception e) {
					Date date = sdf.parse(nextRecord[5]);
					race.setRaceDate(date);
					System.out.println(race.getRaceDate());
				}
				
				String url = nextRecord[7];
				race.setRaceUrl(url);
				System.out.println(race.getRaceUrl());
				
				
											
				races.add(race);
				System.out.println("----------");
				i++;
				
	
			}
				
				for(Races r : races) {
					for(Circuit c :circuits) {
						if(r.getCircuitId()==c.getCircuitId()) {
							c.getRaceList().add(r);
						}
					}
				}
				
				
				
			
				fileReader = new FileReader("res/results.csv");
				
				csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();
			
				i=1;
			
				nextRecord=null;
				
				List<Results> results = new ArrayList<Results>();
				while((nextRecord= csvReader.readNext()) !=null) {
				
				System.out.println("line:"+i);
				System.out.println("line length" +nextRecord.length);
				Results res = new Results();
				
				Integer id = Integer.parseInt(nextRecord[0]);
				res.setResultId(id);
				System.out.println(res.getResultId());
				
				Integer raceId = Integer.parseInt(nextRecord[1]);
				for(Races r : races) {
					if(r.getRaceId()==raceId) {
						
						for(Circuit c :circuits) {
							if(r.getCircuitId()==c.getCircuitId()) {
								res.setCircuit(c);
								
							}
						}
					}
				}
				/*
				 * Integer raceId = Integer.parseInt(nextRecord[1]); for(Races r :races) {
				 * if(r.getRaceId()==raceId) { res.setRace(r);
				 * System.out.println(res.getRace().getRaceName()); break; } }
				 */
				
				
				Integer driverId = Integer.parseInt(nextRecord[2]);
				for(Drivers d :drivers) {
					if(d.getDriverId()==driverId) {
						res.setDriver(d);
						System.out.println(res.getDriver().getForeName());
						break;
					}
				}
				
				Integer conId = Integer.parseInt(nextRecord[3]);
				for(Constuctors c :constructors) {
					if(c.getConstuctroId()==conId) {
						res.setConstuctor(c);
						System.out.println(res.getConstuctor().getConstructorName());
						break;
					}
				}
				
				try {
					Integer num = Integer.parseInt(nextRecord[4]);
					res.setNumber(num);
					System.out.println(res.getNumber());
				} catch (Exception e1) {
					res.setNumber(0);
					System.out.println(res.getNumber());
				}
				
				Integer grid = Integer.parseInt(nextRecord[5]);
				res.setGrid(grid);
				System.out.println(res.getGrid());
				
				
				
				try {
					Integer pos = Integer.parseInt(nextRecord[6]);
					res.setPosition(pos);
					System.out.println(res.getPosition());
				} catch (Exception e) {
					// TODO: handle exception
					res.setPosition(0);
					System.out.println(res.getPosition());
				}
				
				String posT = nextRecord[7];
				res.setPositionText(posT);
				System.out.println(res.getPositionText());
				
				Integer posO = Integer.parseInt(nextRecord[8]);
				res.setPositionOrdered(posO);
				System.out.println(res.getPositionOrdered());
				
				Double poi = Double.parseDouble(nextRecord[9]);
				res.setPoints(poi);
				System.out.println(res.getPoints());
				
				Integer laps = Integer.parseInt(nextRecord[10]);
				res.setLaps(laps);
				System.out.println(res.getLaps());
				
				String time =nextRecord[11];
				res.setTime(time);
				System.out.println(res.getTime());
				
				try {
					Integer fl = Integer.parseInt(nextRecord[13]);
					res.setFastestLap(fl);
					System.out.println(res.getFastestLap());
				} catch (Exception e) {
					// TODO: handle exception
					res.setFastestLap(0);
					System.out.println(res.getFastestLap());
				}
				
				try {
					Integer rank = Integer.parseInt(nextRecord[14]);
					res.setRank(rank);
					System.out.println(res.getRank());
				} catch (Exception e) {
					// TODO: handle exception
					res.setRank(0);
					System.out.println(res.getRank());
				}
				
				String fTime = nextRecord[15];
				res.setFastestLapTime(fTime);
				System.out.println(res.getFastestLapTime());
				
				
				try {
					
					Double speed = Double.valueOf(nextRecord[16]);
					res.setFastestLapSpeed(speed);
					System.out.println(res.getFastestLapSpeed());
					
				}catch (Exception e) {
					// TODO: handle exception
					res.setFastestLapSpeed(0.0);
					System.out.println(res.getFastestLapSpeed());
				}
											
				results.add(res);
				System.out.println("----------");
				i++;
				if(i==10000)break;
			}
				
				
				System.out.println("Done creating json.");
			
			return results;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static boolean writeToDb(List<Results> results) {
		try {
			ConnectionString connectionString = new ConnectionString("mongodb://nastava.is.pmf.uns.ac.rs");
			CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
			CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
					pojoCodecRegistry);
			MongoClientSettings clientSettings = MongoClientSettings.builder().applyConnectionString(connectionString)
					.codecRegistry(codecRegistry).build();
			MongoClient mongoClient = MongoClients.create(clientSettings);
			MongoDatabase db = mongoClient.getDatabase("VukanKoprivica");
			MongoCollection<Results> col = db.getCollection("results", Results.class);
			int i = 1;
			for (Results r:results) {
				System.out.println("Inserting result" + i);
				col.insertOne(r);
				i++;
				if(i==10000)break;
			}

			mongoClient.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static void main(String[] args) {
		List<Results> results = createJson();
		writeToDb(results);
	}

}
