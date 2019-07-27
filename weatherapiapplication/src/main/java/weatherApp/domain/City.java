package weatherApp.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class City {
	
	@Id
	private String id;
	
	private String name;
	private Coord coord;
	private Main main;
	private Sys sys;
	private Wind wind;
	private String date;
	
	
	public City() {
		
	}
	
	public City(String name,String id, Coord coord, Main main, Sys sys, Wind wind) {
		super();
		this.id = id;
		this.coord = coord;
		this.main = main;
		this.sys = sys;
		this.wind = wind;
		this.name = name;
	}
	
	

	public String getDate() {
		return date;
	}

	public String setDate(String date) {
		return this.date = date;
	}

	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public Coord getCoord() {
		return coord;
	}
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	
	
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	
	
	public Sys getSys() {
		return sys;
	}
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	
	
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", coord=" + coord + ", main=" + main + ", sys=" + sys + ", wind="
				+ wind + ", date=" + date + "]";
	}
	
	
	
	
	
	
	
}
