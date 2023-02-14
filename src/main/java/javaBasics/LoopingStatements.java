package javaBasics;

public class LoopingStatements {

	//for loop
	public static void main(String[] args) {
		
		int sum = 0;  
		for(int j = 1; j<=10; j++) {  
		sum = sum + j;  
		}  
		System.out.println("The sum of first 10 natural numbers is " + sum+"\n");  
		System.out.println("----------------------------------------------------------");
		LoopingStatements.forEachLoop();
		System.out.println("----------------------------------------------------------");
		LoopingStatements.whileLoop();
		System.out.println("----------------------------------------------------------");
		LoopingStatements.doWhileLoop();
	}
	
	//for each loop used in array
	public static void forEachLoop() {
		String[] names = {"Java","C","C++","Python","JavaScript"};    
		System.out.println("Printing the content of the array names:\n");    
		for(String name:names) {    
		System.out.println(name);    
		} 
	}
	
	public static void whileLoop() {
		int i=0;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\n");
	}
	
	public static void doWhileLoop() {
		int i=0;
		System.out.println("Printing the list of first 10 even numbers \n");  
		do {
			System.out.println(i);
			i=i+2;
		}while(i<=10);
	}
	
	
}
