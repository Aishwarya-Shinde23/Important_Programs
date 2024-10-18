package Array_Programs;

import java.util.Arrays;
import java.util.Collections;

public class ArrayOrder {

	public static void main(String[] args) {

		System.out.println("-----------Ascending Order------------");
		int arr[] = { 10, 20, 30, 40, 50 };
		Arrays.sort(arr);

		for (int value : arr) {
			System.out.print(value + ", ");
			
		}

		System.out.println("-----------Descending Order------------");
		Integer[] arr1 = { 10, 6, 5, 8, 9, 7, 4, 1 };
		Arrays.sort(arr1, Collections.reverseOrder());

		for (int value1 : arr1) {
			System.out.print(value1 + ", ");
		}
	}

}
