import java.util.Arrays;

public class Print2DArrayUsingForEachLoop {

	public static void main(String[] args) {
	
		Object empInfo[][] = {
				{"Neha", 25, "SDET1", true},
				{"Vijay", 27, "SDET2", false},
				{"Rahul", 28, "SDET Manager", true}
		};
		
		int temp =0;
		int r =0;
		
		for(Object row : empInfo) {
			row = r;
			temp=0;
			for(Object col : empInfo[r]) {
				
				col = temp;
				
				System.out.print(empInfo[(int) row][(int) col]+" ");
				temp++;
			}
			r++;
			System.out.println();
			
		}
		
	}

	
}