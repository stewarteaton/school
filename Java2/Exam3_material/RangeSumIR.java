package Exam3_material;

public class RangeSumIR {

	public static void main(String[] args) {
		int[] numbers = {2,8,3,5,7,1};
		System.out.println(sumI(numbers,2,5));
		System.out.println(sumR(numbers,2,5));
	}

	public static int sumI(int[] array, int start, int end) {
		int s = 0;
		for(int i = start; i<=end; i++) {
			s += array[i];
		}
		return s;
		
	}
	
	public static int sumR(int[] array, int start, int end) {
		if(start > end) {
			return 0;
		}
		else
			return array[start] + sumR(array, start+1, end);
	}
}
