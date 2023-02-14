package oopsConcepts_PartOne;

public class Functions {

	//main method is starting point of excution
	public static void main(String[] args) {

		// excution of non static methods
		System.out.println("---------------------------------Below methods are Non Static methods---------------------------------------");
		Functions fun=new Functions();
		fun.test();
		System.out.println("----------------------------------------------------------------------------------------");
		int intValue = fun.demo();
		System.out.println("Demo method return value is "+intValue);
		System.out.println("----------------------------------------------------------------------------------------");
		String stringValue = fun.demo01();
		System.out.println("Demo_01 method return value is "+stringValue);
		System.out.println("----------------------------------------------------------------------------------------");
		int divisionValue = fun.divsion(30, 5);
		System.out.println("Division method return value is "+divisionValue);
		System.out.println("----------------------------------------------------------------------------------------");
		
		//excution of static methods
		System.out.println("---------------------------------Below methods are Static methods---------------------------------------");
		Functions.test01();
		System.out.println("----------------------------------------------------------------------------------------");
		int intValue01=Functions.demo02();
		System.out.println("Demo02 method return value is "+intValue01);
		System.out.println("----------------------------------------------------------------------------------------");
		String stringValue01 = Functions.demo03();
		System.out.println("Demo_03 method return value is "+stringValue01);
		System.out.println("----------------------------------------------------------------------------------------");
	}

	//non static methods
	//return type void so no need to write "return type"
	public void test() {// no input, по output
		System.out.println("test method");
	}

	//return type - int
	public int demo() { // no input, some output
		System.out.println("Demo method");
		int a = 10;
		int b = 20;
		int с = a + b;
		return с;
	}

	//return type --> String
	public String demo01() {// no input, some output
		System.out.println("Demo_01 method");
		String s = "Selenium";
		return s;
	}

	//return type ... int
	//x,y *** input parameters/orguments
	public int divsion(int x, int y) {
		System.out.println("division method");
		int d = x / y;
		return d;
	}
	
	//static methods
	public static void test01() {// no input, по output
		System.out.println("Test_01 method");
	}

	public static int demo02() { // no input, some output
		System.out.println("Demo02 method");
		int a = 10;
		int b = 20;
		int с = a + b;
		return с;
	}

	public static String demo03() {// no input, some output
		System.out.println("Demo_03 method");
		String s = "Selenium";
		return s;
	}
}
