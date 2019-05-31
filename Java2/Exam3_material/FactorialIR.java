package Exam3_material;

public class FactorialIR {

	public static void main(String[] args) {

		System.out.println(factI(5));
		System.out.println(factR(5));
	}

	public static int factI(int n) {
		int product = 1;
		for(int i=1; i<=n;i++) {
			product *= i;
		}
		return product;
	}
	
	public static int factR(int n) {
		if (n == 1) 	//base case
			return 1;
		else
			return n*factR(n-1);
		
	}
}
