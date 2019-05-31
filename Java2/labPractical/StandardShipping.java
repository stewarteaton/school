package labPractical;

public class StandardShipping implements ShippingCost{
	
	private double BASE_WEIGHT;
	//declares constants
	private static final double BASE_CHARGE = 2.5;
	private static final double EXTRA_POUND_RATE =1;
	
	@Override
	public double getShippingCost(double weight) {
		BASE_WEIGHT = 0;
		
		if(weight>5) {
			BASE_WEIGHT = weight-5;
		}
		return BASE_CHARGE + BASE_WEIGHT*EXTRA_POUND_RATE;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Standard Shipping";
	}

}
