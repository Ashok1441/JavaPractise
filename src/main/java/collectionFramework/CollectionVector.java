package collectionFramework;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
/*
 * Vector uses a dynamic array to store the data elements
 * It is similar to ArrayList
 * Heterogenous objects are allowed
 * Null objects are allowed
 * Insertion order is preserved
 * Duplicate objects are allowed
 * Datastructure is growable array
 * 
 */
public class CollectionVector {

	//list-----vector
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		System.out.println("----------------------------------------------");
		
		//listiterator is hasprevious() works only when we use hasnext() frist
		ListIterator<String> litr=v.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("----------------------------------------------");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}

}
