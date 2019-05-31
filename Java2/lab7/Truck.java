package lab7;

public class Truck extends Vehicle{
	private int truckCapacity;
	
	public Truck(String m, String y, int cap) {
		super(m,y);
		truckCapacity = cap;
	}

	public int getTruckCapacity() {
		return truckCapacity;
	}

	public void setTruckCapacity(int truckCapacity) {
		this.truckCapacity = truckCapacity;
	}
	
	public String toString() {
		String str=String.format("Make: %s\nYear Built: %s\nTruck Capacity: %d lbs\n\n",getMake(),getYear(),getTruckCapacity());
		return str;
	}
}
