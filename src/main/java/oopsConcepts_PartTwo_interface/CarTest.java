package oopsConcepts_PartTwo_interface;

public class CarTest {

	public static void main(String[] args) {
		
		// we can call both classes methods by using MahindarThar class object
		// MahindarThar class methods
//		MahindarThar thar= new MahindarThar();
//		thar.carBrand();
//		thar.start();
//		thar.seatingCapcity();
//		thar.carColor();
//		//car class methods
//		thar.stop();
//		thar.refuel();
//		
//		System.out.println("------------------------------------------------------------");
//		
		//only car class methods can call with car class object
		Car car=new Car();
		car.carColor();
		car.refuel();
		car.seatingCapcity();
		car.start();
		car.stop();
		
		System.out.println("------------------------------------------------------------");
		
		//upcasting 
		// In upcasting it excutes only sub class methods 
		Car c=new MahindarThar();
		c.carColor();
		c.refuel();
		c.seatingCapcity();
		c.start();
		c.stop();
		
		System.out.println("------------------------------------------------------------");
		
		//downcasting
		MahindarThar m= (MahindarThar) new Car();// we get ClassCastException
		m.carBrand();
		m.carColor();
		m.refuel();
		m.seatingCapcity();
		m.start();
		m.stop();
	}

}
