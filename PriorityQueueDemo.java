import java.io.*;
import java.util.*;
class PriorityQueueDemo {
    public static void main(String args[])
	{
	    // Creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		// Adding items to the pQueue using add()
		pQueue.add(200);
		pQueue.add(300);
		pQueue.add(400);
		pQueue.add(500);
		pQueue.add(600);
		System.out.println("The PriorityQueue elements are: ");
		Iterator itr=pQueue.iterator();
		while(itr.hasNext())
		{
		    System.out.println(itr.next());
		}

		// Printing the top element of PriorityQueue
		System.out.println("Top element of priority queue is "+pQueue.peek());
	}
}
