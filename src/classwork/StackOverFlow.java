package classwork;

public class StackOverFlow {
	
	int i=0;

	public void add() {
		System.out.println("add");
		add1();
	}

	public void add1() {
		System.out.println("add1");
		add2();
	}

	public void add2() {
		System.out.println("add2");
		
	}

	public static void main(String[] args) {
		
		
		StackOverFlow sf = new StackOverFlow();
		sf.add();
		
		System.out.println(sf.i);
	}

}
