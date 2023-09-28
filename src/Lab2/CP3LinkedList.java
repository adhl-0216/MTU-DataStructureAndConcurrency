package Lab2;

import java.util.Iterator;
import java.util.NoSuchElementException;
//singly linked list with first reference only 

/**
A linked list is a sequence of links with efficient
element insertion and removal. This class 
contains a subset of the methods of the standard
java.util.LinkedList class.
*/

public class CP3LinkedList<E> {
     private class Node {
		public E data;
		public Node prev;
		public Node next;
	}
	private Node first;
	private Node last;

	/** 
    	Constructs an empty linked list.
	*/
	public CP3LinkedList()
	{  
		first = null;
		last = null;
	}
 
	/**
 	Adds an element to the front of the linked list.
 	@param element the element to add
	 */
	public void addFirst(E element)
	{  
		Node newLink = new Node();
		newLink.data = element;
		newLink.prev = null;
		newLink.next = first;
		if(first != null) first.prev = newLink;
		if(last == null) last = first;
		first = newLink;
	}

	public void addLast(E element)
	{
		if (first == null) {addFirst(element); return;}
		Node newLink = new Node();
		newLink.data = element;
		newLink.next = null;
		newLink.prev = first;
		first.next = newLink;

		last = newLink;
	}

	public E getFirst() {
		if (first == null)
			throw new NoSuchElementException();
		return first.data;
	}

	public E removeFirst() {
		if (first == null)
			throw new NoSuchElementException();
		E element = first.data;
		first = first.next;
		return element;
	}
	public E getLast() {
		if (last == null)
			throw new NoSuchElementException();
		return last.data;
	}

	public E removeLast() {
		if (last == null)
			throw new NoSuchElementException();
		E element = last.data;
		last.prev.next = null;
		return element;
	}

	public void print(){
           //outputs the data on the list
		Node current;
		if (first == null) current = last;
		else current = first;
		while (current != null){
			System.out.print(current.data);
			current = current.next;
		}
	}

	public int size(){
		if (this.first == null) return 0;

		int size = 1;
		Node node = this.first;
		do {
			node = node.next;
			size++;
		} while(node.next != null);
		return size;
	}

	public boolean contains(E target){
		Node node = this.first;

		do {
			if (node.data == target) return true;
			node = node.next;
		} while(node.next != null || node.data == target);

		return false;
	}
}
