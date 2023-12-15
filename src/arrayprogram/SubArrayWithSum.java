package arrayprogram;

import java.util.ArrayList;
import java.util.List;

public class SubArrayWithSum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 7, 5 };

		int value = 12, sum = 0;
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (value == sum) {
				break;
			}
			list.clear();
			sum = 0;

			for (int j = i; j < arr.length; j++) {
				list.add(arr[j]);
				sum = sum + arr[j];
				if (value == sum) {
					Object[] obj = list.toArray();
					for (int k = 0; k < obj.length; k++) {
						System.out.println(obj[k]);
					}
					break;
				} else if (sum > value) {
					break;
				}
			}

		}
	}

}
