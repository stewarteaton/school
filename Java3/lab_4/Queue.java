package edu.olemiss.csci211;


/** An interface for data structures that support Queue operations.
 * 
 * @author rhodes
 *
 * @param <E> the element type.
 */
public interface Queue<E> extends List<E> {

	public void add(E element);
	
	public E remove();
	
	public int size();
	
	public void clear();
}
