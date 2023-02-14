package collectionFramework;

import java.util.Iterator;
import java.util.Stack;
/*
 * stack is the subclass of Vector
 * It implements the last-in-first-out data structure, i.e., Stack
 * The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), 
 * boolean push(object o) is used to add the data
 *  which defines its properties.
 */
public class CollectionStack {

	//list----implements---vector____class___stack
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>(); 
		stack.add("ashok");
		stack.pop(); //pop methsod is used to remove previously saved data, ashok data was removed
		stack.push("Ayush"); 
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");    
		stack.pop(); //pop methsod is used to remove previously saved data, Garima data was removed  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
		System.out.println("---------------------------");
		System.out.println(stack.get(0));
		
	}
}
