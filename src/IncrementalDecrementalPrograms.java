
public class IncrementalDecrementalPrograms {

	public static void main(String[] args) {

		IncrementalDecrementalPrograms obj = new IncrementalDecrementalPrograms();
		obj.program3();
	}

	void program1() {
		int i = 11;

		i = i++ + ++i; 

		System.out.println(i);
	}

	void program2() {

		int a = 11, b = 22, c;

		c = a + b + a++ + b++ + ++a + ++b; //11 + 22 + 11 + 22 + 13 + 24 

		System.out.println("a=" + a);//13
		System.out.println("b=" + b);//24
		System.out.println("c=" + c);
	}

	void program3() {
		int i = 0;

		i = i++ - --i + ++i - i--; //0 - 0 + 1 - 1

		System.out.println(i);
	}

	void program4() {
		
		 //Compile time error, we cannot perform ++ or -- on boolean
	}

	void program5() {
		int i=1, j=2, k=3;

		int m = i-- - j-- - k--;  //1 - 2 - 3
		System.out.println("i="+i);//0

		System.out.println("j="+j);//1

		System.out.println("k="+k); //2

		System.out.println("m="+m);//-4
	}

	void program6() {
		int a=1, b=2;

		System.out.println(--b - ++a + ++b - --a); 
	}

	void program7() {
		int i=19, j=29, k = 0;
		int m = i-- - j-- - k--; //19 - 29 - 0

		System.out.println("i="+i);//18

		System.out.println("j="+j);//28

		System.out.println("k="+k);//-1
		
		System.out.println("m=" + m);//-10
	}

	void program8() {
		
		int i = 11;

		//int j = --(i++); //this is not allowed, ++ or -- apply directly on variables

	}

	void program9() {
		
		int m = 0, n = 0;

		int p = --m * --n * n-- * m--; //-1 * -1 * -1 * -1

		System.out.println(p); //1
	}

	void program10() {
		
		int a=1;

		a = a++ + ++a * --a - a--; //1 + 3 * 2 - 2

		System.out.println(a); //5

	}

	void program11() {
		
		//int a = 11++; //we cannot apply direct on numbers, it can be change like n=11; a=n++;

	}

	void program12() {
		int ch = 'A';

		System.out.println(ch++);//65
	}

	void program13() {
		
		char ch = 'A';

        System.out.println(++ch); //B

	}

	void program14() {
		
		double d = 1.5, D = 2.5;

		System.out.println(d++ + ++D); //1.5 + 3.5

	}

}
