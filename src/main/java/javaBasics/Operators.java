package javaBasics;

public class Operators {

	
	public static void main(String[] args) {
		
		int a=5;
		int b=12;
		int c=-10;
		
		System.out.println("Frist assigned value is "+a);
		
		a++;//6 post incrementing a value by one and assigned to a variable
		System.out.println("post incrementing value is "+a);
		
		a--;//5 post decrementing a value by one and assigned to a variable 
		System.out.println("post decrementing value is "+a);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		++a;//6 pre increment a value by one and d
		System.out.println("pre incrementing value is "+a);
		--a;//5 pre increment a value by one and d
		System.out.println("pre decrementing value is "+a);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println(a++ + ++a);//5+7=12  
		System.out.println(b++ + b++);//12+13=25
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println(a);
		System.out.println(~a);//(minus of total positive value which starts from 0)
		System.out.println(~c);//9 (positive of total minus, positive starts from 0)
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		boolean d=true;  
		boolean e=false;  
		System.out.println(!d);//false (opposite of boolean value)  
		System.out.println(!e);//true  
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		int f=10;  
		int g=5;  
		int h=20;  
		
		/*The logical && operator doesn't check the second condition if the first condition is false. It checks the second condition only if the first one is true.*/
		System.out.println(f<g && f<h);//false && true = false
		System.out.println(f>g && f<h);//true && false = true 
		System.out.println(f>g && f<h);//true & true = true 
		System.out.println(f<g && f>h);//false & false = false 
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");		
		//The bitwise & operator always checks both conditions whether first condition is true or false.
		System.out.println(f<g & f<h);//false & true = false  
		System.out.println(f>g & f<h);//true & true = true 
		System.out.println(f>g & f>h);//true & false = false 
		System.out.println(f<g & f>h);//false & false = false 
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println(" || condition");
		/*The logical || operator doesn't check the second condition if the first condition is true. It checks the second condition only if the first one is false.*/
		System.out.println(f<g || f<h);//false && true = true
		System.out.println(f>g || f<h);//true && false = true 
		System.out.println(f>g || f<h);//true & true = true 
		System.out.println(f<g || f>h);//false & false = false 
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");		
		//The bitwise | operator always checks both conditions whether first condition is true or false.
		System.out.println(f<g | f<h);//false & true = true  
		System.out.println(f>g | f<h);//true & true = true 
		System.out.println(f>g | f>h);//true & false = false 
		System.out.println(f<g | f>h);//false & false = false 
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		f+=f;
		System.out.println(f);
		f-=f;
		System.out.println(f);
		f+=g;
		System.out.println(f);
		short i=10;
		short j=10;
		i+=j;
		System.out.println(i);
	//	i=i+j;Compile time error because 10+10=20 now int 
		i=(short) (i+j); //30 After type casting int is now converted to short 
		System.out.println(i);
	}

}
