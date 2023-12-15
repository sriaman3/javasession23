package classwork;

public class InfinityExceptionClass {
	
	static double p=1;
	
	static int a =2;
	
	static float b=1.2f;

	public static void main(String[] args) {
		
		//Double with different examples
		
		System.out.println(p/0); //Infinity
		
		System.out.println(p/0.0); //Infinity
		
		System.out.println(0/p); //0.0
		
		System.out.println(0.0/p); //0.0
		
		System.out.println("----------------------------");
		//Integer with different examples
		
		//System.out.println(a/0); //AException
		
		System.out.println(a/0.0); //Infinity
		
		System.out.println(0/a); //0
		
		System.out.println(0.0/a); //0.0
		
		//System.out.println(0/0);//AException
		
		System.out.println("----------------------------");
		//Floating with different examples
		
		System.out.println(b/0.0); //Infinity
		
		System.out.println(b/0); //Infinity
		
		System.out.println(0/b); //0.0
		
		System.out.println(0.0/b); //0.0
		
		System.out.println(0.0/b); //0.0
		
		System.out.println("----------------------------");
		//NAN Cases
		System.out.println(0.0/0.0); //NAN
		System.out.println(0/0.0); //NAN
		System.out.println(0.0/0); //NAN
	}

}
