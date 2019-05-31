package lab9;

public class RainfallAmounts {

	private double[] amounts = {};
	
	public RainfallAmounts(double[] a) throws InvalidRainfallAmounts{
		for(double d:a) {
			if(d<0) {
				throw new InvalidRainfallAmounts(d);
			}
		}
		amounts = a;
		getAverage();
	}
	
	public double getAverage() {
		double sum=0;
		int counter = 0;
		for(double d:amounts) {
			sum+=d;
			counter++;
		}
		return sum/counter;
	}
}
