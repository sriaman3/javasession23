
public class DataTypes {

	public static void main(String[] args) {
		
		DataTypes dt = new DataTypes();
		
		dt.asciiValue();

	}
	
	void add2String() {
		String a = "Hello";
		String b = "Naveen K";
		
		System.out.println(a+" "+b);
	}
	
	void sum2Num() {
		int num1 =74;
		int num2 = 36;
		
		System.out.println(num1+num2);
	}
	
	void division2Number() {
		int a=50;
		int b=3;
		
		System.out.println(a/b);
	}
	
	void concatWithT() {
		String str = "Hello Selenium";
		char c ='t';
		System.out.println(str + " "+c);
	}
	
	void program6() {
		int a =100;
		int b =200;
		int c =3400;
		int sum =a+b+c;
		System.out.println("Your Total  amount is."+sum);
	}
	
	void asciiValue() {
		
		char ch = 'h';
		
		System.out.println((byte)ch);
	}
	
	void add3ToAsciiValue() {
		
		char ch = 'd';
		byte b = (byte)(ch+3);
		System.out.println((char) b);
	}
	
	void squareOfNumber() {
		float num = 3.9f;
		System.out.println(num*num);
	}
	

		
	

}
