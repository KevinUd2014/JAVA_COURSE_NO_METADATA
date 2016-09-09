package kn222gn_assign1;

import java.util.Iterator;

public class QueueMain {
	
	public static void main(String args[]){

		Queue queue = new Queue();
		
		Iterator<Object> iterator = queue.iterator();
		
		queue.enqueue("Head");
		queue.enqueue("2");
		queue.enqueue("Three");
		queue.enqueue("4");
		queue.enqueue("Tail");
		
		System.out.println("Is the queue empty?: " + queue.isEmpty() + "\n");
		
		while(iterator.hasNext()){
			
			System.out.print("All the values of the queue is: " + iterator.next());
		}
		
		System.out.println("The size of the queue is: " + queue.size() + "\n");
		System.out.println("The First element of the queue is: " + queue.first() + "\n");
		System.out.println("The Last element of the queue is: " + queue.last() + "\n");
		System.out.println("Removing a element of the queue: " + queue.dequeue() + "\n");
		System.out.println("The New first element of the queue is: " + queue.first() + "\n");
		System.out.println("The New last element of the queue is: " + queue.last() + "\n");
		System.out.println("The New size of the queue is: " + queue.size() + "\n");
		System.out.println("Checking for containing element of the queue(Tail)(true): " + queue.contains("Tail") + "\n");
		System.out.println("Checking for containing element of the queue(4)(true): " + queue.contains("4") + "\n");
		System.out.println("Checking for containing element of the queue(Head)(false): " + queue.contains("Head") + "\n");
		
		queue.enqueue("newTail");
		
		System.out.println("The New last element of the queue is: " + queue.last() + "\n");

		//Making the queue empty
		while(true){
			
			if(queue.isEmpty()){
				
				break;
			}
			else{
				
				System.out.println("Current size of the queue: " + queue.size() + "\n");	
				System.out.println("Dequeueing the queue element of the queue: " + queue.dequeue());	
			}
		}
		System.out.println("Current size of the queue: " + queue.size() + "\n");	

		System.out.println("Is the queue empty?: " + queue.isEmpty());

		
		
	}

}
