package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

/*
 * It is a class which implements set interface. 
 * Introduced in 1.2 Version
 * Hetrogenous objects are allowed
 * Duplicates are not allowed. In case if we add, we won't get compile time error, it will just add once.
 * Only one NULL object is allowed. 
 * Data structure is hashtable.
 * Insertion order is preserved(depends on hashcode number)
 */
public class CollectionHashSet {

	public static void main(String[] args) {
		
		HashSet<Object> s1=new HashSet<Object>(); 
		 s1.add("java"); 
		 s1.add(null);
		 s1.add(1223); 
		 s1.add("selenium"); 
		 s1.add(88.9f); 
		 s1.add(null);
		 s1.add("java");//duplicate data will not print
		 
		 Iterator<Object> i1=s1.iterator(); 
		 while(i1.hasNext()) 
		 { 
		 System.out.println(i1.next()); 
		 }
		 
	}
}
