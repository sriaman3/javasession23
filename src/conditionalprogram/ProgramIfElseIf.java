package conditionalprogram;

public class ProgramIfElseIf {

	public static void main(String[] args) {
		
		boolean var = ProgramIfElseIf.eligibilityForElection(17);
		
		System.out.println(var);
		if(var) {
			System.out.println("Candidate is eligible for election");
		}else {
			System.out.println("Candidate is not eligible for election");
		}
		
		
		/*
		 * int i=10;
		 * 
		 * if(i==-10) { System.out.println("Exit if"); }else {
		 * System.out.println("else"); if(i<=10) { System.out.println("less than 10"); }
		 * }
		 */
	}
	
	//void , return type 
	public static boolean eligibilityForElection(int age) {
		
		if (age>=18) {
			return true;
		} else {
			
			return false;
		}
		
	}

}
