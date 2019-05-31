package todayNow;

public class Rectangle {
	//instance fields 
	private double length;
	private double width;
	
	//constructor
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	//setters and getters
	public void setLength(double l) {
		length = l;
	}
	public void setWidth(double w) {
		width = w;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double getArea() {
		return width*length;
	}
	
	public String toString() {
		String str = String.format("Length %.2f, width%.2f,", length,width);
		return str;
	}
}
