package collectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;

/*
 *  Default capacity is 11.
 *  It allows only homogenous objects.
 *  Bascially data structure of Queue is FIFO but in PriorityQueue internal sorting will happen.
 *  Duplicate objects are allowed.
 *  Null objects are not allowed.
 *  For retrieving of data, they have given the special methods called as peek() and poll().
 *  peek() : It retrieves the head element(top element) without deleting it from queue.
 *  poll() : It retrieves head element(First element) and delete it from queue
 */
public class CollectionPriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		 
		queue.add("Vijay Raj");  
		queue.add("jaiShankar");  
		queue.add("Raj"); 
		queue.add("amit"); 
		
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());
//		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println("-------------------------------------------------------");
		System.out.println("iterating the queue elements:");  
		Iterator<String> itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		System.out.println("-------------------------------------------------------");
		queue.remove();  
		queue.poll();  
//		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
	}
}
