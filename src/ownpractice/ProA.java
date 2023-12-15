package ownpractice;

public class ProA {

	public static void main(String[] args) {
		
		ProA a = new ProA();
		ProA b = new ProA();
		a=b;
		
		
		/**
		 * Working fine for both cases
		 */
		a.method();
		b.method();
		
		/**
		 * Working fine for b.method
		 */
		//a=null;
		b.method();
		a.method();

		/**
		 * Working fine for a.method but data will not prints
		 */
		//b=null;
		b.method();
		a.method();
		
	}
	
	void method() {
		System.out.println("Aman");
	}

}




