package finalVsfinallyVsfinalize;
/*
 * Finalize() is the method of Object class. This method is called just before an object is garbage collected. 
 * finalize() method overrides to dispose system resources, perform clean-up activities and minimize memory leaks.
 */
public class FinalizeExample {

	
	public void finalize() {
		System.out.println("finalized method");
	}
	public static void main(String[] args) {
		FinalizeExample obj= new FinalizeExample();
		obj=null;
		System.gc();

	}
	
	

}
