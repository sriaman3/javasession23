

public class RevesreNumberUsingForEachLoop {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,11};
		
		int a = arr.length-1;
		
		  for(int num : arr) {
		  num=a;
		  System.out.println(arr[num]); 
		  a--;
		  }
		  
		}
	}


