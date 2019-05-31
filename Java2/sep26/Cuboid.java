package sep26;

public class Cuboid extends Rectangle {
	private double height;
	
	public Cuboid(double l, double w, double h) {
		super(l,w);
		height = h;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getsurfaceArea() {
		return getArea()*6;
	}
	
	public double getVolume() {
		return getArea()*height;
	}
	
	public String toString() {
		String str = super.toString();
		str += String.format("height %.2f\nBase area %.2f\nSurface area %.2f\nVolume %.2f\n", height,getArea(), getsurfaceArea(),getVolume());
		return str;
	}
}
