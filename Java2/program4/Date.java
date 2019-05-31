package program4;

public class Date {
	//instance fields
	private int month;
	private int day;
	private int year;
	//constructor1
	public Date(int m, int d, int y) {
		if(isValid(m,d,y)) {
			month = m;
			day = d;
			year = y;
		}
		//creates error if invalid date is entered 
		else
			System.out.println("Error");
	}
	//constructor2
	public Date(Date object2) {
		//checks if date entered is valid
		if(isValid(object2.getMonth(),object2.getDay(),object2.getYear())){
			month = object2.getMonth();
			day = object2.getDay();
			year = object2.getYear();
		}
		else
			System.out.println("Error");
	}
	//setters and getters
	public void setDate(int m, int d, int y) {
		if(isValid(m,d,y)) {
			month = m;
			day = d;
			year = y;
		}
		else
			System.out.println("Error");
	}
	
	public void setMonth(int m) {
		if(m>=1&&m<=12) {
			month=m;
		}
	}
	public void setDay(int d) {
		if(d>=1&&d<=31) {
			day = d;
		}
	}
	public void setYear(int y) {
		if(y>=1000&&y<=9999) {
			year = y;
		}
	}
	
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}
	
	//function to test if dates are valid
	public boolean isValid(int m, int d, int y) {
		if(m<=12&&m>=1 && 1<=d&&d<=31 && y>=1000 &&y<=9999 ) {
			return true;
		}
		else
			return false;
	}
	//toString method
	public String toString() {
		String str = getMonth()+"-"+getDay()+"-"+getYear();
		return str;
	}
}
