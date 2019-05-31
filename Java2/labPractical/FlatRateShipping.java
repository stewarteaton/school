package labPractical;

public class FlatRateShipping implements ShippingCost {
	//declares constant?
	private static final double RATE_PER_POUND =.5;
	
	
	@Override
	public double getShippingCost(double weight) {
		
		return weight*RATE_PER_POUND;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Flate rate shipping";
	}

	
}
