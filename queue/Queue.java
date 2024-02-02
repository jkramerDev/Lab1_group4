package queue;

public interface Queue {

	 boolean isFull() ;
	 boolean isEmpty();
	 
	 // insert elements to the queue
	  void enQueue(String element);
	  
	  // delete element from the queue
	  String deQueue();
	  
	  // display element of the queue
	  void display();
	  
	  //display 'first' element 
	  public String peek();
	
}
