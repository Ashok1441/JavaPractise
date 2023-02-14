package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionArrayDeque {

//	queue---Deque---Arraydeque
	public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		 
		for (String str : deque) {  
		System.out.println(str);  
		}  
		System.out.println(deque.peek());
		System.out.println(deque.poll());
		System.out.println(deque);
		System.out.println(deque.peek());
	}
}
