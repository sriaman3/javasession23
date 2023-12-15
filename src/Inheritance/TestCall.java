package Inheritance;

public class TestCall {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.autoStart();
		b.average();
		b.engine();
		b.refuel();
		b.stop();
		
		/**
		 * Car can access the method of his class and its parent class
		 * 
		 * No class can access anything from children class
		 */
		Car c = new Car();
		c.engine();
		c.average();
		
		/**
		 * This is not possible BMW ba = new Car();, we cannot create an object ref of child class and trying to create an object of the parent class
		 * 
		 * If we do the down casting, while running the program, it will give Class Cast exception
		 */
		//BMW ba = (BMW) new Car();
		
		/**
		 * This is called up casting but we can access only car class method & override method in BMW of car & vehicle
		 * 
		 * Private method only accessable within the same class
		 */
		Car ca = new BMW();
		ca.engine();
		ca.stop();
		//ca.start();
		ca.bmMeth1();
		ca.bmMeth2();
		//ca.start();
		
		
		//This is the only method we can access becoz car has its own method
		Vehicle vh = new Car();
		vh.engine();
		
		/**
		 * Method hiding - will call static method of Car class
		 * 
		 * In method Hiding both the method parent class and child class are static.
		 * 
		 * static method cannot override
		 */
		Car vh1 = new BMW();
		vh1.start();
		
		
		/**
		 * If user is writing-  public static final void start() { } in parent & child class same method, will not allow you write this
		 * 
		 * final will not allow you to override 
		 */
		System.out.println("-----------------------------------------");
		
		BMW ba = (BMW)new Car();
		System.out.println(ba);//class cast exception
		
		
	}

}
