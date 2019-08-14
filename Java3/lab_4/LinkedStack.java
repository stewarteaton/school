package edu.olemiss.csci211;

import java.util.Iterator;

/** A simple stack class that uses a linked implementation.
 * 
 * @author rhodes
 *
 * @param <E>
 */
public class LinkedStack<E> implements Stack<E>, Iterable<E>{

	// Unlike the book, we'll use an inner class for our Node.
	// Its two data members can be accessed directly by the Stack
	// code, so we don't need setters and getters.
	class Node{
		
		E data; 
		Node next;
	}
	
	int size =0;
	Node top; // not public, but can still be seen by other classes in the
			  // csci211 package.
	
	/** Create an empty stack.
	 * 
	 */
	public LinkedStack(){
		
		top = null;
	}
	
	
	/** Push the given element onto the stack.
	 * 
	 * @param e The element to be pushed
	 */
	public void push(E e){
		
		Node n = new Node();
		n.data = e;
		n.next = top;
		top = n;
		
		size++;
	}
	
	/** Pop the element off the top of the stack.
	 * 
	 * @return A reference to the removed element, or null if the stack was empty.
	 */
	public E pop(){
		
		if (top == null)
			return null;

		E r = top.data;
		
		top = top.next;
		
		size--;
		return r;
	}
	
	/** Return a reference to the element on the top of the stack.
	 * 
	 * @return A reference to the topmost element, or null if the stack is empty.
	 */	
	public E peek() {
		
		if (top == null)
			return null;
		
		return top.data;

	}


	public void add(E element) {
		
		this.push(element);
		
	}



	public int size() {

		return this.size;
	}



	public void clear() {
		
		this.top = null;  // We're letting go of the ropes!
		
	}

	
	/** An Iterator for our LinkedStack.
	 * 
	 * @author rhodes
	 *
	 */
	public class LinkedStackIterator implements Iterator<E> {
		
		LinkedStack<E>.Node current;
		
		public LinkedStackIterator(LinkedStack<E> s){
			
			current = s.top;
		}
		
		@Override
		public boolean hasNext() {
			
			return (current != null);
		}

		@Override
		public E next() {

			E r = current.data;
			
			current = current.next;
			
			return r;
		}
		
	}

	/** Returns an Iterator suitable for a LinkedStack. This is from the Iterable interface.
	 * 
	 */
	@Override
	public Iterator<E> iterator() {
		
		return new LinkedStackIterator(this);
	}




	
}
