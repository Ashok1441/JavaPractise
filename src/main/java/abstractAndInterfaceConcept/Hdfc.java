package abstractAndInterfaceConcept;

public class Hdfc extends Bank {
	
	//calling abstract method
	public void loan() {
		System.out.println("HDFC-----------loan");
	}

	// its not a abstract method of abstract bank class and it is one of the method in hdfc class
	public void loan(String bankName) {
		System.out.println(bankName+"-----------loan");
	}
	
	public void account() {
		System.out.println("Hdfc--------------Account");
	}
	
	//overriding the debit method
//	public void debit() {
//		System.out.println("Debit is a overriden method");
//		System.out.println("Hdfc Bank--------debit");
//	}
	
//	public static void main(String[] args) {
//		new Hdfc().loan();
//		new Hdfc().debit();
//	}
	
}
