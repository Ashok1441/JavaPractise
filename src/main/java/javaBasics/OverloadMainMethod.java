package javaBasics;

public class OverloadMainMethod {

	public static void main(String[] args) {
		System.out.println("Main Method");
		main();
		main("One");
		main(1,1);
		main(1);
		
//		int a=1;
//		int b=1;
		boolean a=true;
		boolean b=true;
		if(a!=b) {
			System.out.println("Both a and b are not booleans values are true");
		}else {
			System.out.println("Both a and b booleans values are true");
		}
	}
	
	public static void main() {
		System.out.println("Overloading Main Method -1");
		System.out.println("Overloading the Main Method without Parameters");
	}
	
	public static void main(String one) {
		System.out.println("Overloading the Main Method with "+one+" Parameters");
	}
	
	public static void main(int a) {
		System.out.println("Overloading the Main Method with "+a+" Parameters by using int type data");
	}
	
	public static void main(int a,int b) {
		int c=a+b;
		System.out.println("Overloading the Main Method with "+c+" Parameters");
	}
	
	

}
