package constructorConcept;

public class Add {

	public Add() {
		this(100, 200);// call another const of same class which has 2 integer args
		System.out.println("Default add constructor");
	}

	public Add(int i, int j) {
		this(456.010203,567); ///call another const of same class which has 2 args 1st is double 2nd is int
		System.out.println("Result of int+int is : "+(i+j));
	}

	public Add(double d, int i) {
		System.out.println("Result of double+int is : "+(d+i));
	}

	public static void main(String[] args) {
		Add obj=new Add();
	}
}
