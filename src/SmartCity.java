
public abstract class SmartCity {
	private String Name;
	private String Location;
	public SmartCity() {
		super();
	}
	public SmartCity(String name, String location) {
		Name = name;
		Location = location;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	

}
