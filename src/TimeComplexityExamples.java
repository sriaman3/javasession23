
public class TimeComplexityExamples {

	
	/**
	 * Always remove the constant
	 * Drop the non-dominant terms
	 * Break into fragments
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Aman"); //O(1) because it is a constant.
		meth1();
	}
	
	
	void meth() {
		int i, n = 8;
        for (i = 1; i <= n; i++) {
            System.out.printf("Hello World !!!\n"); //it will print n times the hello world
            //1+n+n+n = O(n)
           }
        }
        
        static void meth1() { //doubt (explain)
        	int i, n = 8;
            for (i = 1; i <= n; i=i*2) {
                System.out.printf("Hello World !!!\n"); //it will print n times the hello world
                //1+n+n+logn+log2 = (1+2n+log n) = O(log n)
            }
	}
        
        void meth2() { //doubt O(log(log n))
        	
        	int i, n = 8;
            for (i = 2; i <= n; i=(int)Math.pow(i,2)) {
                System.out.println("Hello World !!!");
            }
            
            //1+n+n^2 = 1+n+2logn = O(logn)
        }
        
        	void meth3() { 
        	
        	int i, n = 8;
            for (i = 2; i*i <= n; i++) {
                System.out.println("Hello World !!!");
            }
            
            //loop will run till, i^2 = n-1 => i = underroot n-1 => O(underroot n)
        }
        
        public static int sum(int a, int b) { 
        	return a + b; 
        	
        	//1+1 = 2 = O(1)
        	
        }
        
        static int list_Sum(int[] A, int n)
        
        // A->array and
        // n->number of elements in array
        {
            int sum = 0;
            for (int i = 0; i <= n - 1; i++) {
                sum = sum + A[i];
            }
            return sum;
            
            //1+n-1+n+n = 3n = O(n)
        }
        
        void squareMatrix() {  //doubt O(n*m)
        	 int n = 3;
             int m = 3;
             int arr[][]
                 = { { 3, 2, 7 }, { 2, 6, 8 }, { 5, 1, 9 } };
             int sum = 0;
      
             // Iterating over all 1-D arrays in 2-D array
             for (int i = 0; i < n; i++) {
      
                 // Printing all elements in ith 1-D array
                 for (int j = 0; j < m; j++) {
      
                     // Printing jth element of ith row
                     sum += arr[i][j];
                 }
             }
             System.out.println(sum);
             
             //(1+n+n)(1+m+m+m) = O(n*m)
        }

}
