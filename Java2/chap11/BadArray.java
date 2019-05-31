package chap11;

public class BadArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3};
		
		try {
			for(int i =0; i<=3;i++) {
				System.out.println(numbers[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of bounds");
		}
	}

}
