package oopsConcepts_PartTwo_interface;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable h= new Hashtable();
		h.put("Name", "ashok");
		h.put("phone number", 7799359065l);
		h.put('A', "Kumar");
		System.out.println("Hashtable size = "+h.size());
		System.out.println(h);
		System.out.println(h.get("Name"));
		System.out.println(h.get('A'));
		
		h.put(1, "Testing");
		h.put(2, "Quality Assurances");
		h.put(3, 'P');
		System.out.println("Hashtable size = "+h.size());
		
//		String Hashtable, it allows only String data type only. 
//		Key and value should be given as String data type values only for the h1 hashtable.
		Hashtable<String, String> h1=new Hashtable<>();
		h1.put("A", "A");
		System.out.println(h1.get("A"));

	}

}
