package edu.olemiss.csci211;


/** An interface for data structures that support stack operations.
 * 
 * @author rhodes
 *
 * @param <E> the element type.
 */
public interface Stack<E> extends List<E> {

	/** Push the given element onto the stack.
	 * 
	 * @param e The element to be pushed
	 */	
	public void push(E e);

	
	/** Pop the element off the top of the stack.
	 * 
	 * @return A reference to the removed element, or null if the stack was empty.
	 */
	public E pop();

	
	/** Return a reference to the element on the top of the stack.
	 * 
	 * @return A reference to the topmost element, or null if the stack is empty.
	 */	
	public E peek();
	
}
