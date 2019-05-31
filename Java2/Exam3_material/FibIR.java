package Exam3_material;
import java.util.Scanner;
public class FibIR {

	public static void main(String[] args) {
		Scanner san = new Scanner(System.in);
		System.out.print("Enter a positive integer to print out the fib series: ");
		int num = san.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.print(fibI(i)+" ");
		}
		System.out.println();
		
		for(int i=0;i<num;i++) {
			System.out.print(fibR(i)+" ");
		}
		System.out.println();
		
	}
	public static int fibI(int n) {
		int x = 0, y=1, z=1;  //first 3 numbers
		for(int i=0;i<n;i++) {
			x=y;
			y=z;
			z=x+y;
		}
		return x;
	}
	
	public static int fibR(int n) {
		if(n==0)   //base case
			return 0;
		else if(n==1)  //base case
			return 1;
		else			//recursive case
			return fibR(n-1) + fibR(n-2);
	}
}
