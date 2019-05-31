package lab4;

public class LandGrass {
	//instance fields
	public Tract thisTract;
	private double palletPrice;
	
	//constructor
	public LandGrass(Tract tract, double price) {
		thisTract = tract;
		palletPrice = price;
	}
	
	//methods
	public double getNumPallets() {
		double a = thisTract.getArea();
		double n = Math.ceil(a/500);
		return n;
	}
	
	public double getCosts() {
		double p = palletPrice * getNumPallets();
		return p;
	}
	
	//toString method
	public String toString() {
		String str = "";
		return str;
	}
	
}
