package classwork;

public class CallByVal {

	public static void main(String[] args) {
		
		CallByVal call = new CallByVal();
		int sum = call.add(10, 10);
		
		System.out.println(sum);
		
	}
	
	public int add(int a, int b) {
		
		return a+b;
		
	}

}
