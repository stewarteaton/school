package sep26;
import java.util.Scanner;

public class Telephone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an unformatted phone number: ");
		String phoneNum = scan.nextLine();
		if(isUnformatted(phoneNum)) {
			System.out.println("Thefomatted phone number is: "+format(phoneNum));
		}
		
		System.out.print("Enter a formatted phone number: ");
		String phoneNum2 = scan.nextLine();
		if(isFormatted(phoneNum2)) {
			System.out.println("The unformatted phone number is: "+unformat(phoneNum2));
		}
	}
	
	public static boolean containsDigits(String str) {
		boolean status = true;
		for(int i=0; i<str.length(); i++) {
			if(!Character.isDigit(str.charAt(i))) 
				status = false;	
		}
		return status;
	}
	
	public static boolean isUnformatted(String phone) {
		if(phone.length() == 10 && containsDigits(phone))
			return true;
		else
			return false;
	}
	
	public static boolean isFormatted(String phone) {
		if(phone.length() == 13 && phone.charAt(0) == '(' && phone.charAt(4) == ')' && phone.charAt(8) == '-') {
			return true;}
		else {
			return false;
		}
	}
	
	public static String format(String phone) {
		StringBuilder strb = new StringBuilder(phone);
		strb.insert(0,  "(");
		strb.insert(4, ")");
		strb.insert(8, "-");
		return strb.toString();
	}
	
	public static String unformat(String phone) {
		StringBuilder strb = new StringBuilder(phone);
		strb.deleteCharAt(0);
		strb.deleteCharAt(3);
		strb.deleteCharAt(6);
		return strb.toString();
	}
}
