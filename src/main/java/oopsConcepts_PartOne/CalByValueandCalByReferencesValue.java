package oopsConcepts_PartOne;

public class CalByValueandCalByReferencesValue {

	int p;
	int q;
	
	public static void main(String[] args) {
		int x=10;
		int y=20;
		CalByValueandCalByReferencesValue obj = new CalByValueandCalByReferencesValue();
		int s = obj.sumTest(x, y);// call by value or pass by value
		System.out.println(s);

		obj.p=7;
		obj.q=9;
		obj.swapping(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	public int sumTest(int a, int b) {
		a=15;
		b=20;
		int c=a+b;
		return c;
	}
	
	public void swapping(CalByValueandCalByReferencesValue k) {
		System.out.println("Before swapping the value");
		System.out.println(k.p);
		System.out.println(k.q);
		System.out.println("After swapping the value");
		int s;
		s=k.p; //s value is 7
		k.p=k.q; // p value is 9
		k.q=s; // q value is 7
	}

}
