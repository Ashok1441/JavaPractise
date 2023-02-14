package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * It is introduced in java 1.2-version
 * ArrayList stores Heterogeneous data
 * It is possible to add NULL objects in ArrayList
 * It allows Duplicate objects
 * In ArrayList Insertion Order is preserved i.e the way we added objects the way it will be printed.
 * It follows Data Structure as growable size array
 * It follows Data Structure as growable size array
 */
public class CollectionArrayList {

	//list----arraylist
	public static void main(String[] args) {
		
//		it allows all type of data type
		ArrayList<Object> al = new ArrayList<>();
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
		System.out.println(al);// it prints all the arraylist values side by side like this [ashok, 10, 100, 1000000000, 7799359065, A, 10.1, 10.0012, true]
		System.out.println("------------------------------------------------------");
		for(Object allData:al) {
			System.out.println(allData);
				
		}
		System.out.println("------------------------------------------------------");
		
		Employee e1=new Employee("ashok", 25, "QA");
		Employee e2=new Employee("Kumar", 26, "dev");
		Employee e3=new Employee("Pasula", 27, "Devops");
		
		ArrayList<Employee> al1=new ArrayList<Employee>();
		al1.add(e1);
		al1.add(e2);
		al1.add(e3);
		
		Iterator<Employee> iterator= al1.iterator();
		while(iterator.hasNext()) {
			Employee emp = iterator.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			System.out.println("------------------------------------------------------");
		}

		ArrayList<String> ar2= new ArrayList<String>();
		ar2.add("demo");
		ar2.add("collection");
		ar2.add("framework");
		for(String al2:ar2) {
			System.out.println(" ar2 data :"+al2);
		}
		
		ArrayList<String> ar3= new ArrayList<String>();
		ar3.addAll(ar2);
		ar3.add("king");
		ar3.add("prabhas");
		System.out.println(ar3);
		ar3.removeAll(ar2);
		System.out.println(ar3);
		ar3.remove(0);
		System.out.println(ar3);
	}

	

}
