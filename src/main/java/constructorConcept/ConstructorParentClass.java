package constructorConcept;

public class ConstructorParentClass {

	public ConstructorParentClass() {
		System.out.println("Constructor Parent Class");
	}
	
	public ConstructorParentClass(int i) {
		System.out.println("Constructor Parent Class with "+i+" parameter");
	}
	
	public ConstructorParentClass(int i,int j) {
		int k=i+j;
		System.out.println("Constructor Parent Class with "+k+" parameter");
	}
}
