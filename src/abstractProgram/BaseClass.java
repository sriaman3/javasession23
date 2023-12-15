package abstractProgram;

public class BaseClass  extends Abs1{
	
	public BaseClass() {
		System.out.println("Base Class constructor");
	}
	
	public BaseClass(int i) {
		super(20);
		System.out.println(i + "Base Class constructor");
	}

}
