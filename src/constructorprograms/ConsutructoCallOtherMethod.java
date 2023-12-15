package constructorprograms;

public class ConsutructoCallOtherMethod {

	public static void main(String[] args) {
		 new ConsutructoCallOtherMethod();
	}
	
	ConsutructoCallOtherMethod(){
		//this.ConsutructoCallOtherMethod(10); //constructor can not call another constructor within the same class
		meth();
		
	}
	
	ConsutructoCallOtherMethod(int a){
		System.out.println(a);
	}
	
	public void meth() {
		System.out.println("Arun");
	}

}
