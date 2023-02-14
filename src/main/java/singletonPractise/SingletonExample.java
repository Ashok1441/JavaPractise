package singletonPractise;

public class SingletonExample {

	//1n 00P, a singleton class is a class that can have only one object (instance of the class) at a time.

	//how to design singleton class:

	//1. make constructor as private

	//2. write a public static method (getInstance) that has return type of object of this singleton class (Lazy Initialization)
	
	private static SingletonExample singleton_Instance = null;
	public String str;
	
	private SingletonExample() {
		str="I am using singleton class pattern";
	}
	
	public static SingletonExample getInstance() {
		if(singleton_Instance==null) {
		singleton_Instance =new SingletonExample();
		}
		return singleton_Instance;
	}
	
	public static void main(String[] args) {
		SingletonExample x = getInstance();
		SingletonExample y = getInstance();
		
		x.str=(x.str).toUpperCase();
		
		
		System.out.println(x.str);
		System.out.println(y.str);
		
		y.str=(y.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
	}
}
