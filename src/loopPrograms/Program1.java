package loopPrograms;

public class Program1 {

	public static void main(String[] args) {
		
		for(int i=0;true;i--, i++) {
			System.out.println("output is infinite loop");
		}
		
		/*
		 * for(int i=0;1;i++) { System.out.
		 * println("java.lang.Error: Unresolved compilation problem:cannot convert from int to boolean"
		 * ); }
		 */
		
		/*
		 * for(int i=0;false;i++) { System.out.println("unreachable code"); }
		 */
	}

}
