package kn222gn_assign1;

import java.util.Iterator;

public class Queue implements QueueInterface {
	
	public int size = 0;
	
	public Node head;
	
	public Node tail;
	
	public int size() {
		
		int newSize = 0;
		
		return newSize;
	}
	
    public boolean isEmpty() {
		
		return size == 0;
	}
	
	public void enqueue(Object element) {
		
		//code from the lecture;
		if(head == null){
			
			head = new Node(element);
			
			tail = head;
		}
		else{
			
			tail.nextElement = new Node(element);
			tail = tail.nextElement;
		}
		size += 1;
	}
	
	public Object dequeue() throws IndexOutOfBoundsException {

		if(isEmpty()){
			
			throw new IndexOutOfBoundsException(" Wrong with the dequeue it's empty ");
		}
		else{
			
			Node first = head;
			
			//Sets the next in line to the first.
			head = first.getNext();
			
			//decrease the size by one.
			size -= 1;
			
			//returns the new first object
			return first.getObject();
		}
	}
	
	public Object first() throws IndexOutOfBoundsException {
		
		if(isEmpty()){
			
			throw new IndexOutOfBoundsException(" Wrong with the First function it's empty ");
		}
		else{
			
			return head.getObject();
		}
	}

	public Object last() throws IndexOutOfBoundsException {

		if(isEmpty()){
			
			throw new IndexOutOfBoundsException(" Wrong with the First function it's empty ");
		}
		else{
			
			return tail.getObject();
		}
	}
	
	public boolean contains(Object o) {
		return false;
	}
	
	public Iterator iterator() {
		return null;
	}
}
