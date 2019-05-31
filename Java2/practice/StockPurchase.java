package todayNow;

public class StockPurchase {
	//instance fields
	private Stock stock;
	private int shares;
	
	//constructor
	public StockPurchase(Stock stock, int shares) {
		this.stock = stock;
		this.shares = shares;
	}
	
	
	public Stock getStock() {
		return new Stock(stock);
	}
	
	public int getShares() {
		return shares;
	}
	
	public double getCost() {
		return shares*stock.getPrice();
	}
	
	public String toString() {
		String str = stock.toString() + String.format("\nThe total cost is: $%.2f\n", getCost());
		return str;
	}
}
