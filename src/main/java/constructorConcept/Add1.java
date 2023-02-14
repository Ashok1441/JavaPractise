package constructorConcept;

public class Add1 {

	public Add1() {
		this(122.3,200);// call another const of same class which has 2 args 1st is double 2nd is int
		System.out.println("Default add constructor");
	}

	public Add1(int i, int j) {
		this(); // call another const of same class which has 2 args 1st is double 2nd is int
		System.out.println("Result of int+int is : "+(i+j));
	}

	public Add1(double d, int i) {
		System.out.println("Result of double+int is : "+(d+i));
	}
	
	public Add1(int k, float f) {
		this(10,20);
		System.out.println("Result of int+float is : "+(k+f));
	}

	public static void main(String[] args) {
		Add1 obj=new Add1(10,20.3f);
//		Add1 obj=new Add1();
	}
}
