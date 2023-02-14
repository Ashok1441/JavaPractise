package constructorConcept;

public class ConstructorExample2 {

	int id;
	String name;

	// creating a parameterized constructor
	ConstructorExample2(int i, String n) {
		id = i;
		name = n;
	}

	// method to display the values
	public void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects and passing values
		ConstructorExample2 s1 = new ConstructorExample2(111, "Karan");
		ConstructorExample2 s2 = new ConstructorExample2(222, "Aryan");
		// calling method to display the values of object
		s1.display();
		s2.display();
	}
}
