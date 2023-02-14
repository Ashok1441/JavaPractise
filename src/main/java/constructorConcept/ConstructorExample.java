package constructorConcept;

/*
 * A constructor in Java is a special method that is used to initialize objects.
 * The constructor is called when an object of a class is created.
 * At the time of calling constructor, memory for the object is allocated in the memory.
 * It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.
 * 
 */
public class ConstructorExample {

	public static void main(String[] args) {
		ConstructorExample obj = new ConstructorExample();
		System.out.println("-----------------------------------------------------------------");
		ConstructorExample obj01 = new ConstructorExample(121);
		System.out.println("-----------------------------------------------------------------");
		ConstructorExample obj02 = new ConstructorExample("Ashok Kumar",2244);
		System.out.println("-----------------------------------------------------------------");
		obj.test();
		obj01.test();
		obj02.test();
	}
	
	/* Rules for creating a java constructor
	 * Constructor name must be same as that of classname
	 * Constructor can be public, private, protected or default.
	 * Constructor cannot be defined as static, non static, final or abstract.
	 * Constructor does not have any return type not even void
	 * Constructor can be with arguments or without arguments.
	 */
	
	public ConstructorExample() {
		System.out.println("Constructor without parameters");
	}
	
	
	// we can create mutliple constructors with 
	public ConstructorExample(int i) {
		System.out.println("Constructor with 1 parameters");
		System.out.println(i);
	}
	
	public ConstructorExample(String a, int i) {
		System.out.println("Constructor with 2 parameters");
		System.out.println(i);
		System.out.println();
	}
	
	public void test() {
		System.out.println("non static method");
	}
	
}
