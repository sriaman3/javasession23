package Inheritance;

public class BMW extends Car {
	
	final int  speed =200;
	
	
	public static void start() {
		System.out.println("BMW start");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW engine");
	}
	
	public void autoStart() {
		System.out.println("BMW autostart");
	}
	
	//@Override - Private method cannot overide
	private void bmMeth() {
		System.out.println("private for BMW");
	}
	
	@Override
	 protected void bmMeth1() {
		System.out.println("protected for BMW");
	}
	
	//@Override - static cannot override
	static protected void bmMeth3() {
		System.out.println("static for BMW");
	}
	
	@Override
	 void bmMeth2() {
		System.out.println("default for BMW");
	}

}
