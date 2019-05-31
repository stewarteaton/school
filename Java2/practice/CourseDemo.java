package todayNow;

public class CourseDemo {
	
		public static void main(String[] args) {
			//create an Instructor object
			Instructor myInstructor = new Instructor("Xiong", "Melody", "Weir 217");
			//create a TextBook object
			TextBook myTextbook = new TextBook("Java Programming", "Gaddis", "Pearson");
			//create a Course object
			Course myCourse = new Course("CSCI 112", myInstructor, myTextbook);
			
			//display info of the course
			System.out.println(myCourse);
		}
	
	
}
