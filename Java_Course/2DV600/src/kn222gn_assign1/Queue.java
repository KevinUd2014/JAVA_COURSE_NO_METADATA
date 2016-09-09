package kn222gn_assign1;

import java.util.Iterator;

public class Queue implements QueueInterface {
	
	public int size = 0;
	
	public Node head;
	
	public Node tail;
	
	public int size() {
		
		//int newSize = 0;
		
		return size;// made an error here by using another size
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
		
		Iterator<Object> iterator = iterator();
		
		while(iterator.hasNext()){
			
			if(o == iterator.next()){
				
				return true;
			}
		}
			
			
		return false;
	}
	
	public Iterator iterator() {
		
		return new IteratorClass();
	}
	
	public class IteratorClass implements Iterator<Object> {// had an integer first but changed to object.
        
		public Node node = head;
        
        public boolean hasNext() {
        	
            return node != null;
        }
        
        public Object next() {
        	
        	if(node != null){
        		//got this bit of code from the lecture
        		 Object val = node.getObject();
                 node = node.getNext();
                 
                 return val;
        	}
        	else{
        		throw new IndexOutOfBoundsException("Wrong with the function next in IteratorClass");
        	}
        }
}
}
