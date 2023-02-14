package javaBasics;

public class ConditionalStatements {

	static int x = 10;
	static int y = 120;
	static int z = 15;

	public static void main(String[] args) {

		if (x > y & x > z) { // true & false = false
			System.out.println("X is a greater number");
		} else if (y > z) { // true
			System.out.println("Y is a greater number");
		} else {
			System.out.println("Z is a greater number");
		}

		System.out
				.println("------------------------------------------------------------------------------------------");
		ConditionalStatements.findGreaterNumber();
		ConditionalStatements.demo();
		ConditionalStatements.demo1();
	}

	public static void findGreaterNumber() {

		if (x > y) {
			if (x > z) {
				System.out.println("X is a greater number");

			} else {
				System.out.println("Z is a greater number");
			}

		} else {
			if (y > z) {
				System.out.println("Y is a greater number");

			} else {
				System.out.println("Z is a greater number");
			}
		}
	}

	public static void demo() {
		String address = "Delhi, India";
		
		System.out.println(address.split(",")[0]);
		
		
		if (address.endsWith("India")) {
			if (address.contains("Meerut")) {
				System.out.println("Your city is Meerut");
			} else if (address.contains("Noida")) {
				System.out.println("Your city is Noida");
			} else {
				System.out.println(address.split(",")[0]);
			}
		} else {
			System.out.println("You are not living in India");
		}
	}
	
	public static void demo1() {
		if(x!=10) {
			System.out.println("Both are not equal Number");
		}
		else {
			System.out.println("Both are  equal Number");
		}
	}

}
