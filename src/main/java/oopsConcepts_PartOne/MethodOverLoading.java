package oopsConcepts_PartOne;

/*
 * 
 * If a class has multiple methods having same name but different in parameters or arguments, it is known as Method Overloading.
 * No method can be created inside of another method.
 * Same method name with same number of agruments are not allowed
 * yes, we can overload main method
 * we can create multiple methods with same name and same number of arguments, but data type should be different
 */
public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading obj=new MethodOverLoading();
		obj.text();
		obj.text("1");
		obj.text(1, 1);
		MethodOverLoading.main(5);//  we can call static methods and variable by using class name or directly
		main(5);
	}

	public static void main(int i) {
		
		System.out.println(i+"\nyes, we can overload main method");
	}
	
	public void text() { // 0 input parameters/arguments

		System.out.println("Method OverLoading with 0 input paramters");
	}

	public void text(String a) { // 1 input parameters/arguments

		System.out.println("Method OverLoading with "+a+" input paramters");
	}

	public void text(int a) { // 1 input parameters/arguments with different data type of arguments

		System.out.println("Method OverLoading with "+a+" input paramters");
	}
	
	public void text(int a, int b) { // 2 input parameters/arguments

		int c=a+b;
		System.out.println("Method OverLoading with "+c+" input paramters");
	}
	
}
