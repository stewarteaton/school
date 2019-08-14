package lab_5;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceTest {

	
	public static void main(String[] args) {
		
		runGetTestOnLinkedList(1000000, 100000);
		runGetTestOnArrayList(1000000, 100000);
		
		runInsertTestOnLinkedList(1000000, 100000);
		runInsertTestOnArrayList(1000000, 100000);
	}
	
	/** Run timed tests for a linked list implementation, using the get() operation.
	 * Tests are run for several values of n. 
	 * @param nMax The largest value of n, the problem size.
	 * @param dn  The increase in problem size betweeen tests.
	 */
	static void runGetTestOnLinkedList(int nMax, int dn){
		
		System.out.println("runGetTestOnLinkedList");
		for(int n=1; n<nMax; n+=dn){
			
			List<Integer> ll = new LinkedList<>();
			fillList(ll, n);			
			
			System.out.println(n + "\t"+ timeGet(ll, 10000));
		}
		System.out.println();
	}

	/** Run timed tests for an ArrayList implementation, using the get() operation.
	 * Tests are run for several values of n. 
	 * @param nMax The largest value of n, the problem size.
	 * @param dn  The increase in problem size between tests.
	 */
	static void runGetTestOnArrayList(int nMax, int dn){

		System.out.println("runGetTestOnArrayList");

		for(int n=1; n<nMax; n+=dn) {
			
			List<Integer> al = new ArrayList<>();
			fillList(al,n);
			
			System.out.println(n +"\t"+timeGet(al,100000));
		}
		// Use 100000 repetitions
		
		//Write Me.
		
		System.out.println();

	}

	/** Run timed tests for a LinkedList implementation, using the add() operation.
	 * Tests are run for several values of n. 
	 * @param nMax The largest value of n, the problem size.
	 * @param dn  The increase in problem size betweeen tests.
	 */
	static void runInsertTestOnLinkedList(int nMax, int dn){
		
		System.out.println("runInsertTestOnLinkedList");
		
		// Use 10000000 repetitions
		//Write Me.
		for(int n=1; n<nMax; n+=dn) {
			
			List<Integer> ll = new LinkedList<>();
			fillList(ll,n);
			
			System.out.println(n +"\t"+timeInsert(ll,10000000));
		}
		
		System.out.println();

	}
	

	/** Run timed tests for an ArrayList implementation, using the add() operation.
	 * Tests are run for several values of n. 
	 * @param nMax The largest value of n, the problem size.
	 * @param dn  The increase in problem size betweeen tests.
	 */	
	static void runInsertTestOnArrayList(int nMax, int dn){
		
		System.out.println("runInsertTestOnArrayList");
		for(int n=1; n<nMax; n+=dn){
			 
			List<Integer> al = new ArrayList<>();
			fillList(al, n);			
			
			System.out.println(n + "\t"+ timeInsert(al, 10000));
		}
	}

	
	/** Return the wall-clock time required to perform r calls to get() on the 
	 * provided list.
	 * @param l The list
	 * @param r The number of repetitions.
	 * @return execution time in milliseconds
	 */
	static float timeGet(List<Integer> l, long r){
		
		int n = l.size();
		long then = System.currentTimeMillis();
		
		for(int i=0; i<r; i++){
			
			int j= (int) (Math.random() * (n-1)); // compute random list position
			l.get(j);
		}
		
		return (System.currentTimeMillis() - then);
	}

	/** Return the wall-clock time required to perform r calls to add() on the 
	 * provided list. Elements are added at the beginning of the list.
	 * @param l The list
	 * @param r The number of repetitions.
	 * @return execution time in milliseconds
	 */	
	static long timeInsert(List<Integer> l, long r){
		
		long then = System.currentTimeMillis();
		
		for(int i=0; i<r; i++){
			
			l.add(0, 67); // This is really an insertion at the beginning of the list.
		}
		
		return System.currentTimeMillis() - then;
	}

	
	/** Add r elements to the provided list.
	 * 
	 * @param l  The list
	 * @param r  The number of elements to add.
	 */
	static void fillList(List<Integer> l, int r){
	
		for(int i=0; i < r; i++){
			
			l.add(7);
		}
	}

}
