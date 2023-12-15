package arrayprogram;

public class FindAllPairs {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5,7};
		
		int[] arr1 = {5,6,3,4,8};
		
		int findPair = 9, sum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0; j<arr1.length;j++) {
				
				sum = arr[i]+arr1[j];
				
				if(findPair == sum) {
					System.out.println(arr[i] + " " + arr1[j]);
				}
			}
		}
	}

}
