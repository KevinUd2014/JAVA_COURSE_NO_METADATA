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
		try{
			
			if(isEmpty()){
				
				throw new IndexOutOfBoundsException();
			}
			else{
				
				Node first = head;
				
				head = first.getNext();
				
				return first.getObject();
			}
		}
		catch(Exception e){
			e.getMessage();
		}
		
		return null;
	}
	
	public Object first() throws IndexOutOfBoundsException {
		return null;
	}

	public Object last() throws IndexOutOfBoundsException {
		return null;
	}
	
	public boolean contains(Object o) {
		return false;
	}
	
	public Iterator iterator() {
		return null;
	}
}
