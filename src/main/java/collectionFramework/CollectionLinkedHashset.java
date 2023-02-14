package collectionFramework;

import java.util.LinkedHashSet;

/*
 *  Heterogenous objects are allowed 
 *  Duplicates are not allowed. In case if we add we won't get compile time error, it will just add once 
 *  only one NULL object is allowed
 *  Data structure is Linkedlist.
 *  Insertion order is preserved
 *  Set is only uni directional so it supports only Iterator 
 */
public class CollectionLinkedHashset {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> set=new LinkedHashSet<Object>();
		set.add(null);
		set.add(1234);
		set.add("ashok");
		set.add(101.23);
		set.add('A');
		set.add("ashok");
		set.add(null);
		System.out.println(set);
	}
}
