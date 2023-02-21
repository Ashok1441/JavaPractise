package abstractAndInterfaceConcept;

public interface Car {

	//In interface only having abstrat class
	//always define abstract class only
	//having only methods declaration
	//no method body 
	//we can achive 100% abstration
	// we can't create object for interface
	
	//  varible can be final or static only, if didn't mention it take as final or static
	final int driveMode=4;
	
	public void startCar();
	public void stopCar();
	public void refuelCar(String refuelName);
}
