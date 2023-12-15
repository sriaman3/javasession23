import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		program();
	}
	
	static void program() {
		ArrayList<String> studentNames = new ArrayList<String>();

		studentNames.add("Varun");

		studentNames.add("Reena");

		studentNames.add("Naveen");

		studentNames.add("Robin");

		studentNames.add("Peter");
		
		int startIndex = 0, endIndex = 3;
		
			if(startIndex>=0 && endIndex>startIndex) {
				
			for(int i=0;i<studentNames.size();i++) {
				
				
				if(startIndex==endIndex || startIndex==studentNames.size()) {
					break;
				}else if(i==startIndex) {
					System.out.println(studentNames.get(i));
					startIndex++;
				}
			}
			
		}
	
		
	}
//Extract list using for loop. Don't use subList() method
	
// Add 10 colors and print even number color	
}
