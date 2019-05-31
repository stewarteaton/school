package todayNow;

public class Course {
	//instance fields
	private String courseName;
	private Instructor instructor;
	private TextBook textbook;
	
	//constructor 
	public Course(String name, Instructor instr, TextBook text) {
		courseName = name;
		instructor = instr;
		textbook = text;
	}
	
	//getters
	public String getName() {
		return courseName;
	}
	//instructor file
	public Instructor getInstructor() {
		//return copy instead of original like a receipt
		return new Instructor(instructor);
	}
	//Textbook file
	public TextBook getTextbook() {
		return new TextBook(textbook);
	}
	
	//toString method
	public String toString() {
		String str = "Course name: " + courseName + "\nInstructor: " + instructor + "\nTextbook: " + textbook;
		return str;
	}
}
