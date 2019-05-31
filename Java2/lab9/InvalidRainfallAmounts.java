package lab9;

public class InvalidRainfallAmounts extends Exception{


	public InvalidRainfallAmounts() {
		super("Error: invalid rain amount ");
	}
	public InvalidRainfallAmounts(double a) {
		super("Error: invalid rain amount "+a);
	}
}
