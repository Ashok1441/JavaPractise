package constructorConcept;

public class ConstructorExample3 {
	int id;
	String name;
	public ConstructorExample3() {
		test(); // in constructor we can call the non static method with out creating the object
		StaticTest();
	}
	public ConstructorExample3(int i, String n) {
		id = i;
		name = n;
	}

	public void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		ConstructorExample3 s1 = new ConstructorExample3();
		ConstructorExample3 s2 = new ConstructorExample3(111, "Karan");
		s1.id = s2.id;
		s1.name = s2.name;
		s1.display();
		System.out.println("---------------------------------------------");
		s2.display();
		
		
	}
	
	public void test() {
		System.out.println("Non static Test Method");
	}
	
	public static void StaticTest() {
		System.out.println("Static Test Method");
	}

}
