package lab7;

public class Bus extends Vehicle{
	private int maxPassenger;
	
	public Bus(String m, String y, int max) {
		super(m,y);
		maxPassenger = max;
	}

	public int getMaxPassenger() {
		return maxPassenger;
	}

	public void setMaxPassenger(int maxPassenger) {
		this.maxPassenger = maxPassenger;
	}
	
	//toString 
	public String toString() {
		String str = String.format("Make: %s\nYear Built: %s\nBus Capacity: %d passengers\n\n",getMake(),getYear(),getMaxPassenger());
		return str;
	}
}
