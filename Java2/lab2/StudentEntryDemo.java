package lab2;

import java.util.ArrayList;

public class StudentEntryDemo {
	public static void main(String[] args) {
		StudentEntry s1 = new StudentEntry("James Smith","662-915-1234","jsmith@go.olemiss.edu");
		StudentEntry s2 = new StudentEntry("Catherine Byrd","662-801-1678","cbyrd@go.olemiss.edu");
		StudentEntry s3 = new StudentEntry("Bill Wang","901-380-8972","bwang@go.olemiss.edu");

		ArrayList<StudentEntry> list = new ArrayList<StudentEntry>(3);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		String name;
		String number;
		String email;
		for (int i=0; i < list.size(); i++) {
			StudentEntry entry = list.get(i);
			name = entry.getName();
			number = entry.getNumber();
			email = entry.getEmail();
			
			System.out.printf("Student %d\n\tName: %s\n\tPhone Number: %s\n\tEmail: %s\n\n", i+1,name,number,email);
			
		}	
	}

}
