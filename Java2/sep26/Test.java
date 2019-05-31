package sep26;

public class Test {
	//might appear on test
	
		public static void main(String[] args) {
			String str="Four score and seven years ago";
			System.out.println("The letter r appears at the following locations: ");
			int position = str.indexOf('r');
			while (position!= -1) {
				System.out.print(position + " ");
				position = str.indexOf('r',position+1);
			}
			
			String str2 = "and a one and two and a three";
			System.out.println("The word \" and\" appears at the following location: ");
			int positionAnd = str2.indexOf("and");
			while(positionAnd != -1) {
				System.out.print(positionAnd + " ");;
				positionAnd = str2.indexOf("and", positionAnd+1);
			}
}
}
