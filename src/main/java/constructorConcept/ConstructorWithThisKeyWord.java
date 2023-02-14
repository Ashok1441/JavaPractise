package constructorConcept;

public class ConstructorWithThisKeyWord {

	String name;
	int i;
	String surname;
	int age;
	
	public static void main(String[] args) {
		
		ConstructorWithThisKeyWord obj=new ConstructorWithThisKeyWord("ashok",852);
		ConstructorWithThisKeyWord obj1=new ConstructorWithThisKeyWord(26,"Pasula");
		obj.test("Pasula", "Ashok Kumar", 26);
	}
	
	public ConstructorWithThisKeyWord(String name,int i) {
		System.out.println(name+"\n"+i);
	}
	public ConstructorWithThisKeyWord(int age,String surname) {
		this.surname=surname;
		this.age=age;
		System.out.println(surname+"\n"+age);
	}
	
	public void test(String surname, String name,int age) {
		this.surname=surname;
		this.name=name;
		this.age=age;
		System.out.println(surname+" "+name+" "+" "+age);
		
	}
}
