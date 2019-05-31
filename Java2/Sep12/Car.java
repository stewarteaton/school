package Sep12;

public class Car {
	//instance fields
	private CarType type;
	private CarColor color;
	private double price;
	
	public Car(CarType aType, CarColor aColor, double aPrice) {
		type = aType;
		color = aColor;
		price = aPrice;
	}
	
	public CarType getType() {
		return type;
	}
	
	public CarColor getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		String str = String.format("Type: %s\nColor: %s\nPrice: $%.2f\n", type,color,price);
		return str;
	}
}
