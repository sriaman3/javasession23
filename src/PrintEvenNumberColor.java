import java.util.ArrayList;

public class PrintEvenNumberColor {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Red");

		colors.add("Green");

		colors.add("Orange");

		colors.add("Purple");

		colors.add("Black");
		
		colors.add("Black1");
		colors.add("Black2");
		colors.add("Black3");
		colors.add("Black4");
		colors.add("Black5");
		
		for(int i=0; i<colors.size();i++) {
			
			if(i>0 && i%2==0) {
				System.out.println(colors.get(i));
			}
		}

	}

}
