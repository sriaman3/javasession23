package classwork;

public class OutOFMemoryError {

	public static void main(String[] args) {
		
		Integer[] arr = new Integer[1000000*10000]; 
		System.out.println(arr);
	}

}
