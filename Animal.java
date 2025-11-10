/**
 * Javadoc Multiple-line
 * @author Musa Mohammed and Miriam Mohammed
 * @version 1.0
 * 
 * @since 1.4
 * @see java.lang
 * 
 */
class Animal {
	
	// This is a single-line comment for class variable - place holder
	String name;
	
	public String getName(){
		return name;
	}
	/* This a Multiple-line comment
	  Note: Method signature is the method name and parameter types
	  setName(String)
	 */
	public void setName(String newName){
		name = newName;
	}
	
	public static void main(final String... args) {
		
		System.out.println("Not Again");
	}
	
}
