package lab7;

public class Vehicle {
	private String make;
	private String year;
	
	//constructor
	public Vehicle(String m, String y) {
		make = m;
		year = y;
	}

	//constructed setters and getters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	public String toString() {
		String str = String.format("Make: %s\nYear Built: %s\n\n",getMake(),getYear());
		return str;
	}
	
}
