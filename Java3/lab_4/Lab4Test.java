package edu.olemiss.csci211;
import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Job 1. Implement LinkedQueue.remove() and LinkedQueue.clear(). There are tests inside the csci211 package.
 * 			
 * 
 * Job 2. Make LinkedQueue extend the Iterable interface. This means you'll need to make a LinkedQueueIterator class
 * 			that implements the Iterator interface. Look at LinkedStack for an example.  
 * 
 * 			With this done, the first two tests below should pass, meaning you can use the "fancy loop syntax"
 * 			with your collection code.
 * 
 * 
 * Job 3. Make LinkedQueue extend the List interface, and move your "extends Iterable<E>" from LinkedQueue and 
 * 			LinkedStack to the List interface. 
 * 
 * 			The idea here is to let LinkedStack and LinkedQueue share the List interface, so the total() method
 * 			given below doesn't need to know what kind of list it is being given. That means we can use total()
 * 			on either Stacks or Queues, and it won't know the difference. That is, we can use whatever implementation
 * 			seems best, and we won't need to modify the code in total() at all. 
 * 
 */

public class Lab4Test {

	
	@Test
	public void testFancyLoopSyntax1() {
		
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		int sum =0;
		for(Integer i:q) {
			
			sum += i;
		}
		
		assertEquals(15, sum);
	}
	
	@Test
	public void testFancyLoopSyntax2() {
		
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
				
		int sum =0;
		for(Integer i:q) {
			
			sum += i;
		}
		
		assertEquals(0, sum);
	}

	@Test
	public void testTotalWithStack() {
		
		List<Integer> s = new LinkedStack<Integer>();
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);

		assertEquals(15, total(s));	
	}

	@Test
	public void testTotalWithQueue() {
		
		List<Integer> q = new LinkedQueue<Integer>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);

		assertEquals(15, total(q));	
	}

	
	
	
	/* If we make both the Stack and Queue interfaces extend the List 
	 * interface, we can call this method with either a LinkedStack or
	 * LinkedQueue as the argument, and it will work. Of course, both
	 * LinkedStack and LinkedQueue must also implement Iterable.
	 */
	int total(List<Integer> list) {
		
		int sum = 0;
		for(Integer i:list) {
			
			sum += i;
		}
		
		return sum;
	}
	

}
