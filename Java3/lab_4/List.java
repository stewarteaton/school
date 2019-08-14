package edu.olemiss.csci211;

import java.util.Iterator;


/** An interface for data structures that implement very basic list operations.
 * 
 * @author rhodes
 *
 * @param <E>
 */
public interface List<E> extends Iterable<E> {
	
	public void add(E element);
	
	public int size();
	
	public void clear();
}
