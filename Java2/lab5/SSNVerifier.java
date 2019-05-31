package lab5;
import java.util.Scanner;

public class SSNVerifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a social security number:");
		String ssn = sc.nextLine();
		
		if(!isValid(ssn)) {
			do {
				System.out.print("Your SSN \"" + ssn + "\" is not valid!\nThe SSN should follow the format DDD-DD-DDDD\n\n");
				System.out.print("Please Enter your SSN again: ");
				ssn = sc.nextLine();
			
			} while(isValid(ssn) == false);
		}
		
		System.out.print("Congratulations! Your SSN \"" + ssn + "\"is valid");

	}



public static boolean isValid(String ssn) {
	String regExpression = "^\\d{3}-\\d{2}-\\d{4}$";
	
	return ssn.matches(regExpression);
	}
}