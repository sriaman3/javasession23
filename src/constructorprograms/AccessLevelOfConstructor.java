package constructorprograms;

public class AccessLevelOfConstructor {

	//default Access spedifier is not allowed
	//Public private & protected is allowed
	//Private we cannot call outside of the class
	
	/**
	 * It can be used with static members-only classes.
	 * 
	 * Java allows us to declare a constructor as private. We can declare a constructor private by using the private access specifier.
	 * 
	 * If a constructor is declared private, we are not able to create an object of the class. 
	 * Instead, we can use this private constructor in Singleton Design Pattern.
	 * 
	 * If all the methods are static then we can use a private constructor.
	 * 
	 * To limit the number of instance creation
	 */
	
	private static AccessLevelOfConstructor acc;
	
	private AccessLevelOfConstructor() {
		
	}
	
	public static  AccessLevelOfConstructor getInstance() {
		if(acc==null) {
			acc = new AccessLevelOfConstructor();
		}
		System.out.println("Aman");
		return acc;
	}
	
}
