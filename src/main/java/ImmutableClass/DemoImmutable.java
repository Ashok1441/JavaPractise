package ImmutableClass;

/*
 * Immutability means that something cannot be changed. In Java, an immutable class is one whose state cannot be changed once it has been created.
 */


public final class DemoImmutable {

	/*
	 * To create an immutable class in Java, you have to do the following steps.
	 * 
	 * 1. Declare the class as final so it can’t be extended.
	 * 2. Make all fields private so that direct access is not allowed.
	 * 3. Don’t provide setter methods for variables.
	 * 4. Make all mutable fields final so that its value can be assigned only once.
	 * 5. Initialize all the fields via a constructor performing deep copy.
	 */
	
	final String demoImmutableString;
	
	public DemoImmutable(String demoImmutableString) {
		
		this.demoImmutableString=demoImmutableString;
		System.out.println(demoImmutableString);
	}
	
	public String getDemoImmutableString() {
		return demoImmutableString;
		
	}
	
}

