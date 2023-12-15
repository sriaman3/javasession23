package StringPrograms;

public class StringProgram {

	public static void main(String[] args) {
		
		/**
		 * Revesrse the String
		 */
		
		String str = "Welcome to java world";
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			 rev = rev+str.charAt(i);
		}
		
		System.out.println(rev);
	}

}
