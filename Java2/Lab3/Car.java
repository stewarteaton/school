package Lab3;

public class Car {
	//instance fields
	private String yearModel;
	private String make;
	private double price;
	
	//constructors
	
	public Car(String year, String make, double price) {
		yearModel = year;
		this.make = make;
		this.price = price;
		
	}
	
	//setters
	public void set(String year, String make, double price) {
		yearModel = year;
		this.make = make;
		this.price = price;
	}
	
	//getters
	public String getModel() {
		return yearModel;
	}
	public String getMake() {
		return make;
	}
	public double getPrice() {
		return price;
	}
	
	//toString method
	public String toString() {
		String str = "";
		return str;
	}
}
