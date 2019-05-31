package lab2;

public class StudentEntry {
	//instance field
	String name;
	String number;
	String email;
	
	
	//constructor
	public StudentEntry(String a, String b, String c) {
		name = a;
		number = b;
		email = c;
	}
	
	//setters
	public void setName(String n) {
		name = n;
	}
	public void setNumber(String p) {
		number = p;
	}
	public void setEmail(String e) {
		email = e;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public String getEmail() {
		return email;
	}
	
	
}
