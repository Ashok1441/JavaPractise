package abstractAndInterfaceConcept;

public class TestBank {

	public static void main(String[] args) {
		Hdfc hdfc = new Hdfc(); 
		hdfc.debit(); 
		hdfc.credit();
		hdfc.loan("Hdfc----Bank");
		hdfc.loan();
		hdfc.account();
		System.out.println("--------------------------------------------");
		
		Bank bank=new Hdfc();
		//its not a abstract method of abstract bank class and it is one of the method in hdfc class, so we cant use this method by dynamic polymorpshim
//		bank.loan("Hdfc----Bank");
//		bank.account(); this method also not a part of abstract bank class, so we cant use this method by dynamic polymorpshim
		bank.loan();
		bank.credit();
		bank.debit();
		
	}
}
