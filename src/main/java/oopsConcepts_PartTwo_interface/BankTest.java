package oopsConcepts_PartTwo_interface;

/*
 * objects cannot be created using an interface.
 */
public class BankTest {

	public static void main(String[] args) {
		
		System.out.println(UsBank.minBlances);
//		UsBank.minBlances=200; A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.
		
		
		//UsBank bank= new UsBank();
		
		HDFCBank hdfc=new HDFCBank();
		hdfc.savingAccount();
		hdfc.salaryAccount();
		hdfc.debitCard();
		hdfc.netBanking();
		hdfc.mutalFunds();
		
		//dyanmic polymorphism : Child class object can be referred by parent interface variable, but we can access only overridden methods of interface
		UsBank usbank = new HDFCBank();
		usbank.savingAccount();
		usbank.salaryAccount();
		usbank.debitCard();
//		usbank.netBanking(); this methods is not a overriden method, so by dynamic polymorphism we cant access this method

		UkBank ukbank= new HDFCBank();
		ukbank.mutalFunds();
	}

}
