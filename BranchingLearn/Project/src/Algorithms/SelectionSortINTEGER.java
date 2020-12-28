package Algorithms;

public class SelectionSortINTEGER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 99, 10, 55, 99, 88, 77, 64, 91, 97 };
		int temp, min = 0;
		/* This for loop is for iterating over various elements and swapping with the minimum number in the array */
		for (int i = 0; i < a.length; i++) {
			min = i;
			/*
			 * This for loop is for iterating over each element of the array and
			 * and detects the index of the smallest number in the array. 
			 * Once found the index will be updated min variable
			 */
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}

			}

			temp = a[i];
			a[i] = a[min];
			a[min] = temp;

		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
