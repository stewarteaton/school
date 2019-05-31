package todayNow;
import java.util.ArrayList;

public class Sep5th {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("James");
		nameList.add("Catherine");
		
		System.out.println(nameList);
		
		System.out.print("The size of the array list is " + nameList.size());
		
		System.out.println("\nThe first name is " + nameList.get(0));
		
		nameList.remove(1);
		System.out.println(nameList);
		
		nameList.add(0, "Mary");
		System.out.println(nameList);
		
		nameList.set(1, "John");
		System.out.println(nameList);
	}
}
