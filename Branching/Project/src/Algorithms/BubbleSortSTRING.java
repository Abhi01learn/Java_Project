package Algorithms;

public class BubbleSortSTRING {

	public static void main(String[] args) {

		String strArray[] = { "Priya","Monica","Ria","Neha","Aparna","Abhishek" };
		String temp;
		/* This for loop is for iterating over various rounds */
		for (int i = 0; i < strArray.length; i++) { 
			int flag = 0;
			/*
			 * This for loop is for iterating over each element of the array and
			 * interchanging if greater. -i if for excluding the last element as its already
			 * sorted, to save some time for iteration
			 */
			for (int j = 0; j < strArray.length - 1 - i; j++) {
				if (strArray[j].compareTo(strArray[j + 1])>0) {
					temp = strArray[j];
					strArray[j] = strArray[j + 1];
					strArray[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}

		}

		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}
	}

}
