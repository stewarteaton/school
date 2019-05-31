package todayNow;

public class Instructor {
	//instance fields
	private String lastName;
	private String firstName;
	private String officeNumber;
	
	//constructors
	public Instructor(String last, String first, String office) {
		lastName = last;
		firstName = first;
		officeNumber = office;
	}
	public Instructor(Instructor object2) {
		lastName = object2.lastName;
		firstName = object2.firstName;
		officeNumber = object2.officeNumber;
	}
	
	//setter
	public void set(String last, String first, String office) {
		lastName = last;
		firstName = first;
		officeNumber = office;
	}
	
	//getters here
	
	//toString method
	public String toString() {
		String str = "\n\tLast name: " + lastName + "\n\tFirst name: " + firstName + "\n\tOffice " + officeNumber;
		return str;
	}
}
