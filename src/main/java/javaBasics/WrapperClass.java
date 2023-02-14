package javaBasics;

/*
 * Wrapper class means converting one data type to another datatype
 * 
 */
public class WrapperClass {

	public static void main(String[] args) {
	
		//Converting String data type to integer data type
		String a="100";
		// String a="100S"; //While converting string to int type, if String contians any characters in String value it throws NumberFormatException
		System.out.println(a+20);
		int b=Integer.parseInt(a);
		System.out.println(b+20);
		
		//Converting String data type to double data type
		String c="10.010101";
		System.out.println(c+999);
		double d = Double.parseDouble(c);
		System.out.println(d+999);
	
		//Converting String data type to char data type
		String e="Hello";
		System.out.println(e);
		char f=e.charAt(0);
		System.out.println(f);
		
		//Converting String data type to long data type
		String g="7799359065";
		System.out.println("String value is"+g);
		long h = Long.parseLong(g);
		System.out.println(h);
		
		//Converting String data type to float data type
         String i="1234.24";
         System.out.println(i+12345);
         float j = Float.parseFloat(i);
         System.out.println(j);
         
       //Converting float data type to String data type
         float k=9177.203f;
         System.out.println(k+212);
         String  l= String.valueOf(k);
         System.out.println(l+212);
		
	}

}
