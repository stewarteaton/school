package Exam3_material;

public class BinarySearchIR {

	public static void main(String[] args) {
		int[] numbers = {1,3,5,7,9};
		System.out.println(binarySearchI(numbers,0,numbers.length-1,5));
		System.out.println(binarySearchR(numbers,0,numbers.length-1,5));
		
	}

	public static int binarySearchI(int[] array, int first, int last, int key) {
		while(first<=last) {
			int middle = (first+last)/2;
			if(array[middle]==key) {
				return middle;
			}
			else if(array[middle]<key) {
				first = middle +1;
			}
			else
				last = middle -1;
		}
		return -1;
	}
	
	public static int binarySearchR(int[] array, int first, int last, int key) {
		if(first > last) {				//base case
			return -1;
		}
		else {							//recursive case
			int middle = (first + last)/2;
			if(array[middle]==key) {
				return middle;}
			else if(array[middle]<key) {
				return binarySearchR(array, middle+1, last, key);
			}
			else
				return binarySearchR(array,first,middle-1,key);
				
		}
			
	}
}
