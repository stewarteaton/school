package lab4;

public class Tract {
	//instance fields
	private double length;
	private double width;
	
	//constructors
	public Tract(double l, double w) {
		length = l;
		width = w;
	}
	public Tract(Tract object) {
		length = object.length;
		width = object.width;
	}
	
	//setters
	public void setLength(double l) {
		length = l;
	}
	public void setWidth(double w) {
		width = w;
	}
	
	//getters
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	
	//method to return area
	public double getArea() {
		double area = length*width;
		return area;
	}
	
	//toString method
		public String toString() {
			String str = "";
			return str;
		}
}
