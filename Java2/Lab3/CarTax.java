package Lab3;

public class CarTax {
	//object fields
	private Car myCar;
	private double stateRate;
	double carTax;
	
	
	
	//constructors
	public CarTax(Car c, double rate) {
		myCar = c;
		stateRate = rate;
	}
	
	//getters
	public double getTax() {
		return (stateRate/100)*myCar.getPrice();
		
	}
	
	//toString method
	public String toString() {
		String str = String.format("\n\nThe tax for a %s %s with the price $%.2f is $%.2f", myCar.getModel(),myCar.getMake(),myCar.getPrice(),getTax());
				
		return str;
	}
}
