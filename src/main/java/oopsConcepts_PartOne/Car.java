package oopsConcepts_PartOne;

public class Car {

	int mod;
	String color;
	String brand; 
	
	public static void main(String[] args) {
		//new Car();---> this obejct of Car class
		//a,b,c these are object references varible of their objects
		//car is object variable name
		Car a = new Car();
		Car b=new Car();
		Car c=new Car();
		Car d=new Car();
		
		a.brand="Jeep Compass";
		a.mod=2022;
		a.color="Black";
		
		b.brand="Mahindra Thar";
		b.mod=2022;
		b.color="Black & Red";
		
		c.brand="Range rover";
		c.mod=2022;
		c.color="white and Black";
		
		System.out.println("Before assigning the references");
		System.out.println(a.brand+"\n"+a.mod+"\n"+a.color);
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println(b.brand+"\n"+b.mod+"\n"+b.color);
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println(c.brand+"\n"+c.mod+"\n"+c.color);
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println("After Shifting the references");
		a=b;
		b=c;
		c=a;
		System.out.println(a.brand+"\n"+a.mod+"\n"+a.color);
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println(b.brand+"\n"+b.mod+"\n"+b.color);
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println(c.brand+"\n"+c.mod+"\n"+c.color);
		System.out.println("--------------------------------------------------------------------------------------");
		
	}

}
