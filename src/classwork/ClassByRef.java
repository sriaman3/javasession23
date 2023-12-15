package classwork;

public class ClassByRef {
	
	public static void test(ClassByRef ref) {
		
		ref.test1();
	}
	
	public  void test1() {
		System.out.println("Aman");
	}

	public static void main(String[] args) {
		
		Test tt =new Test();
		
		ClassByRef ref = new  ClassByRef();
		System.out.println(ref);
		
		ClassByRef.test(ref);
		
		//ClassByRef.test(tt); //Compile time error
		
	}

}


class Test{
	
}
