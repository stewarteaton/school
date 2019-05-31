package todayNow;

public class Stock {
	//instance fields
	private String symbol;
	private double sharePrice;
	
	//constructor
	public Stock(String symbol, double price) {
		//example of using this to clarify 
		this.symbol = symbol;
		sharePrice = price;
	}
	
	public Stock(String sym) {
		this(sym,0.0);
	}
	
	//overloaded constructor that takes an object as an argument
	//copy an object with same class 
	public Stock(Stock object2) {
		symbol = object2.symbol;
		sharePrice = object2.sharePrice;
	}
	
	//getters and setters
	public String getSymbol() {
		return symbol;
	}
	public double getPrice() {
		return sharePrice;
	}
	
	public void setSymbol(String sym) {
		symbol = sym;
	}
	public void setPrice(double p) {
		sharePrice = p;
	}
	
	//toString method
	public String toString() {
		String str = "Symbol " + symbol + "\nShare Price: " + sharePrice;
		return str;
	}
	
	//equals method
	public boolean equals(Stock object2) {
		if(symbol.equals(object2.symbol) && sharePrice == object2.sharePrice) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//copy method
	public Stock copy() {
		Stock copyObject = new Stock(symbol, sharePrice);
		return copyObject;
	}
}
