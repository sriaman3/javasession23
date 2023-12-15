package arrayprogram;

import java.util.ArrayList;
import java.util.List;

public class Array2SubsetOfArray1 {

	public static void main(String[] args) {

		int arr[] = { 10, 5, 2, 23, 19 };

		int arr1[] = {5,2,19};

		int length = arr1.length;

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				
				if(arr1[i] == arr[j]) {
					list.add(arr1[i]);
				}

			}
		}
		
		if(list.size()==length && length>0) {
			System.out.println("arr1 issubset of arr");
		}else {
			System.out.println("Not a subset");
		}

	}

}
