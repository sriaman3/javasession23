package abstractProgram;

public class TestRun {

	public static void main(String[] args) {
		
		//BaseClass bc = new BaseClass(); //Am abstract class constructor (if BaseClass doesnot have constructor)
		
		//BaseClass bc1 = new BaseClass();//(if BaseClass & Abstract class have constructor)
		
		BaseClass bc2 = new BaseClass(10);//(if BaseClass & Abstract class have constructor & overloaded constructor)
		
		//Output - Am abstract class constructor     10Base Class constructor
		
	}

}
