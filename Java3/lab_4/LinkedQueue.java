package edu.olemiss.csci211;

import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.olemiss.csci211.LinkedStack.LinkedStackIterator;

public class LinkedQueue<E> implements Queue<E>, Iterable<E> {

	protected class Node {
		
		E element;
		Node next;
	}
	
	Node head, end;
	int size = 0;
	public LinkedStack<E>.Node top;

	
	public LinkedQueue(){
		
		head=end=null;
		size = 0;
	}

	@Override
	public void add(E element) {

		Node n = new Node();
		n.element = element;
		n.next = null;
		
		if(end == null){
			head = end = n;
			
		} else {
			
			end.next = n;
			end=n;
		}
		size++;
	}
	
	public void clear() {
		
		// Write me.
		this.head=null;
		this.end=null;
		this.size=0;
	}
	
	/** Remove the element at the head of the queue, and return its value.
	 *  Return null if the queue is empty.
	 * 
	 * @return the removed element
	 */
	@Override
	public E remove() {
		// Write me.
		if(head == null) {
			throw new IllegalArgumentException();
		}
		
		if (head == end) {
			end = null;
		}
		
		E value = head.element;
				
		head = head.next;
		size -= 1;
		
		return value;
	}

	public int size() {
		
		return size;
	}
	
	/** An Iterator for our LinkedQueue.
	 * 
	 * @author rhodes
	 *
	 */
	private class LinkedQueueIterator implements Iterator<E> {
		
		LinkedQueue<E>.Node current;
		
		public LinkedQueueIterator(LinkedQueue<E> s){
			
			current = s.head;
		}
		
		@Override
		public boolean hasNext() {
			
			return (current != null);
		}

		@Override
		public E next() {

			E r = current.element;
			
			current = current.next;
			
			return r;
		}
		
	}

	/** Returns an Iterator suitable for a LinkedStack. This is from the Iterable interface.
	 * 
	 */
	@Override
	public Iterator<E> iterator() {
		
		return new LinkedQueueIterator(this);
	}

}
