package todayNow;

public class StockPurchaseDemo {
	
	public static void main(String[]args) {
		Stock myStock = new Stock("XYZ",9.56) ;
		StockPurchase buy = new StockPurchase(myStock,100);
		System.out.println(buy);
	}
}
