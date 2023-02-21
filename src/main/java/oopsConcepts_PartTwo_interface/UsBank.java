package oopsConcepts_PartTwo_interface;
/*
 * Only methods declaration
 * no method body
 * in interface we can declare the variables, variables are by default set to be static 
 * variables values will be not changed, its a final value which are mentioned in interface
 * no static methods in interface, all methods are in non static only
 * no main method in interface	
 * we cannot create the object for Interface
 * Interface is abstract nature
 */
public interface UsBank {

	final int minBlances=100;
	
	public void savingAccount();
	public void salaryAccount();
	public void debitCard();

}
