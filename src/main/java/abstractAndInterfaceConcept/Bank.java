package abstractAndInterfaceConcept;

/*
 * A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body).
 * 
 * Abstraction is a process of hiding the implementation details and showing only functionality to the user.
 * 
 * Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message
 * You don't know the internal processing about the message delivery.
 */
public abstract class Bank {

	/*
	 *partial abstraction
	 *hiding the implemention logic is called abstraction
	 *abstraction contains abstract methods and non abstract methods 
	 *cannot create the object of abstract class
	 */
	
	
	
	//abstract method
	public abstract void loan(); // no method body 
	
	//non abstract method
	public void debit() { // having method body
		System.out.println("Bank--------debit");
	}
	
	public void credit() {
		System.out.println("Bank--------credit");
	}
}
