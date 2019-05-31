package sep26;

public class Test1 {

	public static void main(String[] args) {
		String full = "Mary Susan Smith";
		
		int space1 = full.indexOf(" ");
		int space2 = full.lastIndexOf(" ");
		
		String first = full.substring(0, space1);
		String middle = full.substring(space1, space2);
		String last = full.substring(space2+1);
		
		System.out.println("First name: " + first + "\nMiddle name: " + middle + "\nLast name: " + last);
	}
}
