package javaBasics;

/*in this class we having variable types and Datatypes 
 * 
 * Data types are two types they are Primitive type(system defined) and Non Primitive(user defined)
 * 
 * variable are used to store the data for printing or future use 
 * using variable name we alocate the memory for data
 * 
 */
public class DataAndVariableTypes {

	static String a = "ashok"; // static variable

	int i = 10;// non static or Instance variable

	public static void main(String... args) {

		char m='a'; //(char is a data type, variable name is a m and "a" is a data) 
		byte c=112;
		short b=210; //local variable
		long l=7799359065l;
		float f=10.1f;
		double d=10.0012;
		d=10.0101; // replacing old value with new value if we mention data type for variable it takes as duplicate 
		 int y=2023;
		 long z=(int)y;// converting int data type into long data type
		
		System.out.println(c);
		System.out.println(b);
		System.out.println(l);
		
		
		System.out.println(m);
		System.out.println(f);
		System.out.println(d);
		
		// we can call static methods and variable by using class name or directly
		System.out.println("Accessing the static variable using driectly "+a); 
		System.out.println("Accessing the static variable using Class name "+DataAndVariableTypes.a);
		
		//to call the non static variable we need to create an object for class
		DataAndVariableTypes dt = new DataAndVariableTypes();
		System.out.println(dt.i);

		
		System.out.println(y);
		System.out.println(z);
	}

}
