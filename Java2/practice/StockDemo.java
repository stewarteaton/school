package todayNow;

public class StockDemo {
	
	public static void main(String[] args) {
		//Todo construct stock object
		Stock xyz = new Stock("XYZ",9.62);
		//Stock abc = xyz.copy();
		Stock abc = new Stock(xyz);
		//Stock abc = new Stock("ABC");
		
				
		if (xyz.equals(abc))
			System.out.println("They have the same contents");
		else {
			System.out.println("They do not have same contents");
		}
				
		if(xyz==abc) {
			System.out.print("They reference same object");
		}
		else {
			System.out.print("They dont ref same object");
		}
		//System.out.println(xyz.toString());
		
		
	}
	
	
	
}
