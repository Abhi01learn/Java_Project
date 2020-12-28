package Algorithms;

public class SelectionSortSTRING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strArray[] = { "Priya","Monica","Ria","Neha","Aparna","Abhishek" };
		String temp;
		int min = 0;
		/* This for loop is for iterating over various elements and swapping with the minimum number in the array */
		for (int i = 0; i < strArray.length; i++) {
			min = i;
			/*
			 * This for loop is for iterating over each element of the array and
			 * and detects the index of the smallest number in the array. 
			 * Once found the index will be updated min variable
			 */
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[j].compareTo(strArray[min])<0) {
					min = j;
				}

			}

			temp = strArray[i];
			strArray[i] = strArray[min];
			strArray[min] = temp;

		}

		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}

	}

}
