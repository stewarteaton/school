package program2;
import java.util.Random;

public class Die {
	//declare instance fields
	private int sides;
	private int value;
	
	//constructor to initialize object of class
	public Die(int numSides) {
		sides = numSides;
		roll();
	}
	
	//setter for setting number of sides and value of die
	public Die(Die object) {
		sides = object.sides;
		value = object.value;
	}
	
	
	//getters for calling the number of sides and value of die
	public int getSides() {
		return sides;
	}
	public int getValue() {
		return value;
	}
	
	//create a roll method which randomly generates a number for
	//roll of a dice between 1 and the highest number on die
	public void roll(){
		Random x = new Random();
		int n = x.nextInt(sides)+1;
		value = n;
	}
}

