package Algorithms;

public class BubbleSortINTEGER {

	public static void main(String[] args) {

		int intArray[] = { 44, 1, 9, 3, 5, 55, 79, 99, 99, 12 };
		int temp;
		/* This for loop is for iterating over various rounds */
		for (int i = 0; i < intArray.length; i++) { 
			int flag = 0;
			/*
			 * This for loop is for iterating over each element of the array and
			 * interchanging if greater. -i if for excluding the last element as its already
			 * sorted, to save some time for iteration
			 */
			for (int j = 0; j < intArray.length - 1 - i; j++) {
				if (intArray[j] > intArray[j + 1]) {
					temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}

		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}

}
