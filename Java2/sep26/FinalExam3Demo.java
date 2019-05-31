package sep26;

public class FinalExam3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalExam3 exam1 = new FinalExam3(100,20);
		FinalExam3 exam2 = new FinalExam3(100,30);
		
		System.out.println("Exam 1: "+ exam1.getScore());
		System.out.println("Exam 2: "+ exam2.getScore());
		
		if(exam1.equals(exam2)) {
			System.out.println("Two scores are equal");
		}
		
		if(exam1.isGreater(exam2)) {
			System.out.println("Exam 1 score higher");
		}	
		if(exam1.isLess(exam2)) {
			System.out.println("Exam 2 higher");
		}
	}

}
