package oopsConcepts_PartTwo_interface;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
//		it allows all type of data type
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("ashok");
		al.add(10);//byte
		al.add(100);//short
		al.add(1000000000);//int
		al.add(7799359065l);//long
		System.out.println("Size of the  ArrayList length = "+al.size());
		System.out.println(al);// it prints all the arraylist values
		System.out.println(al.get(0));
		
		al.add('A');//char
		al.add(10.1f); //float
		al.add(10.0012);// double
		al.add(true); //boolean
		System.out.println("Size of the  ArrayList length = "+al.size());
		System.out.println(al);// it prints all the arraylist values
		System.out.println("------------------------------------------------------");
		for(Object allData:al) {
			System.out.println(allData);
		}
		
//		String ArrayList, it allows only String data type only
		ArrayList<String> alS = new ArrayList<String>();
		alS.add("Ashok");
//		alS.add('A');
		
		
	}

	

}
