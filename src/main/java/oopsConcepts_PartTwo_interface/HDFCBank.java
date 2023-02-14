package oopsConcepts_PartTwo_interface;
/*
 * if a class is implemets any interface, then it is mandatory to overriden the all the methods of interface
 */
public class HDFCBank implements UsBank,UkBank {

	//HDFC bank methods
	public void netBanking() {
		System.out.println("HDFC***********NetBankimg");
	}
	
//   US bank overriden methods	
	public void savingAccount(){
		System.out.println("HDFC.......Saving.......Account");
	}
	public void salaryAccount(){
		System.out.println("HDFC.......Salary.......Account");
	}
	public void debitCard() {
		System.out.println("HDFC.......Debit....card.......issued");
	}
	
	
//	UKbank overriden methods	
	public void mutalFunds() {
		System.out.println("Investing--------Mutal funds");
	}
	
	
}
