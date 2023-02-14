package constructorConcept;

public class ConstructorChildClass extends ConstructorParentClass{

	public ConstructorChildClass() {
		super();
		System.out.println("Calling the first Constructor with super keyword");
	}
	
	public ConstructorChildClass(int i) {
		super(i);
		System.out.println("Calling the Second Constructor with super keyword");
	}
	
	public ConstructorChildClass(int i,int j) {
		super(i,j);
		System.out.println("Calling the third Constructor with super keyword");
	}
	
	public static void main(String[] args) {
		System.out.println("Constructor child class");
		System.out.println("---------------------------------------------------------------");
		ConstructorChildClass obj=new ConstructorChildClass();
		System.out.println("---------------------------------------------------------------");
		ConstructorChildClass obj1=new ConstructorChildClass(1);
		System.out.println("---------------------------------------------------------------");
		ConstructorChildClass obj2=new ConstructorChildClass(1,1);
		
	}
}
