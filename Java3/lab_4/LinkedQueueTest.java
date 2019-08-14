package edu.olemiss.csci211;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class LinkedQueueTest {
	
	

	@Test
	public void constructorDoesntThrow() {
		
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
	}
	
	@Test
	public void addDoesntThrow() {
		
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		q.add(5);
	}

	@Test(expected = java.util.NoSuchElementException.class)
	public void removeThrows() {
		
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		q.remove();
	}

	
	@Test
	public void addRemove1() {
		
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		q.add(5);
		int v = q.remove();
		
		assertEquals(5,v);
	}
	
	@Test
	public void addRemove2() {
		
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		
		q.add(5);
		q.add(7);
		int v = q.remove();
		
		assertEquals(5,v);
	}
	
	@Test
	public void addRemove3() {
		
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		
		q.add(5);
		q.add(7);
		int v = q.remove();
		
		assertEquals(5,v);
	}
	
	@Test
	public void addRemove4() {
		
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		
		q.add(5);
		q.add(7);
		q.remove();

		int v = q.remove();
		
		assertEquals(7,v);
	}
	
	@Test(expected = java.util.NoSuchElementException.class)
	public void addRemoveShouldThrow() {
		
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		
		q.add(5);
		q.add(7);
		q.remove();
		q.remove();

		q.remove(); // should throw
	}

	@Test
	public void addAfterRemove() {
		
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		
		q.add(5);
		q.remove();
		q.add(12);

		int v = q.remove(); 
		assertEquals(12, v);
	}

	@Test
	public void sizeAfterClear() {
		
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		
		q.add(5);
		q.clear();
		
		assertEquals(0, q.size());
	}

	
	
	@Test
	public void addAfterClear() {
		
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		
		q.add(5);
		q.clear();
		q.add(12);

		int v = q.remove(); 
		assertEquals(12, v);
	}

	
	
	
	//
	// Iterator Tests
	//
	//
	
	@Test
	public void hasNextFalseOnEmptyList() {
	
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		
		Iterator<Integer> iter = q.iterator();
		
		assertFalse(iter.hasNext());
	}
	
	
	@Test
	public void hasNextTrueforSingle() {
	
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		
		q.add(10);
		
		Iterator<Integer> iter = q.iterator();
		
		assertTrue(iter.hasNext());
	}
	

	@Test
	public void hasNext2() {
	
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		
		q.add(10);
		
		Iterator<Integer> iter = q.iterator();
		
		assertTrue(iter.hasNext());
		
		iter.next();
		
		assertFalse(iter.hasNext());
	}
	
	
	@Test
	public void hasNext3() {
	
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		
		q.add(10);
		q.add(11);
		
		Iterator<Integer> iter = q.iterator();
		
		assertTrue(iter.hasNext());
		
		iter.next();
		
		assertTrue(iter.hasNext());
		
		iter.next();
		
		assertFalse(iter.hasNext());

	}
	

	


}
