package program2;

public class Player {
	//create private variable instance fields
	private String name;
	private int points;
	
	//constructors to initialize objects of class
	public Player(String n, int p) {
		name = n;
		points = p;
	}
	public Player(Player object2) {
		name = object2.name;
		points = object2.points;
	}
	
	//setters to set players points 
	public void setPoints(int newPoints) {
		points = newPoints;
	}
	
	//getters to call a player's points or name
	public Player getValues() {
		Player playerValues = new Player(name,points);
		return playerValues;
	}
	public String getName() {
		String n = name;
		return n;
	}
	public int getPoints() {
		int p = points;
		return p;
	}
}
