package finalVsfinallyVsfinalize;

public class FinallyConcept {

	public static void main(String[] args) {
		demo01();
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		demo02();
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		division();
	}
	
	public static void demo01() {
		try {
			System.out.println("Expection is not geeting in try block, so no need to excute the catch block");
		} catch (Exception e) {
			System.out.println("getting exception in try block, so excuting the catch block");
		}
		finally {
			System.out.println("Java finally block is a block used to execute important code such as closing the connection");
		}
	}
	
	public static void demo02() {
		try {
			System.out.println("Expection is geeting in try block, so need to excute the catch block");
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("getting exception in try block, so excuting the catch block");
		}
		finally {
			System.out.println("Java finally block is a block used to execute important code such as closing the connection");
		}
	}
	
	public static void division() {
		int k=10;
		try {
			int i=k/0;
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("getting exception in try block, so excuting the catch block");
		}
		finally {
			System.out.println("Java finally block is a block used to execute important code such as closing the connection");
			int j=k/10;
			System.out.println(j);
		}
	}
}
