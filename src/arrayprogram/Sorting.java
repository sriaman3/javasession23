package arrayprogram;

public class Sorting {

	public static void main(String[] args) {

		int arr[] = { 10,5,5, 2, 23, 19,-10};

		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) { //ASC order just opposite (a>b) for DESC order

					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int j = 0; j < arr.length; j++) {

			System.out.println(arr[j]);
		}
	}

}
