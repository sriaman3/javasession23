package Inheritance;

public class Car extends Vehicle{
	
	final int  speed =500; //there is no variable overriding concept in java
	
	public static  void start() {
		System.out.println("Car Start");
	}
	
	public void stop() {
		System.out.println("Car Stop");
	}
	
	public void refuel() {
		System.out.println("Car refuel");
	}
	
	public void average() {
		System.out.println("Car average");
	}
	
	
	private void bmMeth() {
		System.out.println("private for Car");
	}
	
	 protected void bmMeth1() {
		System.out.println("protected for car");
	}
	 
	 static protected void bmMeth3() {
			System.out.println("static for car");
		}
	
	void bmMeth2() {
		System.out.println("default for car");
	}

}
