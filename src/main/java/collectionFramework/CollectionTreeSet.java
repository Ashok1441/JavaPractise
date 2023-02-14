package collectionFramework;

import java.util.Iterator;
import java.util.TreeSet;
/*
 * Heterogenous objects are not allowed if we add we will get class cast exception
 * Duplicates are not allowed .In case if we add we won't get compile time error, it will just add once
 * No NULL object is allowed, we get nullpointer exception
 * Data structure is tree.
 * Output is in Sorted Order
 * Set is only uni directional so it supports only Iterator
 */
public class CollectionTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Object> set=new TreeSet<Object>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
//		set.add('A');
//		set.add(null);
		//traversing elements  
		Iterator<Object> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
	}
}
//output
//Ajay
//Ravi
//Vijay
