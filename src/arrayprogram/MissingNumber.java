package arrayprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingNumber {
	
	static List<Integer> lists = new ArrayList<>();

	public static void main(String[] args) {

		int[] arr = {1,3,4,5,8,9,10};
		
		Arrays.sort(arr);
		int len = arr.length-1;
		addNumberInList(arr[len]);
		
		comparison(arr);
	}
	
	static void addNumberInList(int val) {
		
		while(val>0) {
			lists.add(val);
			val--;
		}
		
	}
	
	static void comparison(int[] arr) {
		
		Set<Integer> li = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		
		Set<Integer> set = new HashSet<>(lists);
		
		set.removeAll(li);
		
		System.out.println(set.toString());
	}
	
	
}
	





