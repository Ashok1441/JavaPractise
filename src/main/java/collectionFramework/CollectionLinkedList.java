package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
 * LinkedList is a class which implements List as well as Queue Interface.
 * class LinkedList implements List,Queue
 * Queue q1=new LinkedList();
 * Here q1 will exhibits behaviour of queue.
 * All features are same, only difference is LinkedList implementing Queue interface. 
 * Objects will not be sorted rather insertion order is maintained. 
 */
public class CollectionLinkedList {

	//list-linked lsit
	public static void main(String[] args) {
		
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ashok");  
		al.add("Kishore");  
		al.add("Akhil");  
		al.add("Sreekanth");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		
		System.out.println("-------------------------------------------------------");
		queueLinkedList();
	}
	
	//queue---Deque---Linkedlist
	public static void queueLinkedList() {
		Queue<Object> q1=new LinkedList<>(); 
		 q1.add("Selenium");
		 q1.add("JAVA"); 
		 q1.add("HTML"); 
		 q1.add("CSS"); 
		 q1.add("SOAP"); 
		 q1.add("AWS"); 
		  
		 while(q1.peek()!=null) 
		 { 
		 System.out.println(q1.poll()); 
		 } 
	}
}
