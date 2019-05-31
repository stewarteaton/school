package sep26;

public class CSStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSStudent student = new CSStudent("Carl Smith", "12345678",2015);
		student.setMathHours(12);
		student.setCsHours(20);
		student.setGenEdHours(12);
		
		System.out.println("\nRemaining Hours: " + student.getRemainingHours());
		
	}

}
