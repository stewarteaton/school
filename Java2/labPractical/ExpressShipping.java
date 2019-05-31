package labPractical;

public class ExpressShipping extends StandardShipping{
	
	private final static double EXPRESS_FEE = 10;
	
	@Override
	public double getShippingCost(double weight) {
		return EXPRESS_FEE + super.getShippingCost(weight);
	}
	
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Express Shipping";
	}

}
