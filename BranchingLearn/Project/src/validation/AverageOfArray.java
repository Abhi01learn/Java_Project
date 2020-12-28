package validation;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {

		// calculate the average value of an array
		Scanner scan = new Scanner(System.in);
		float sum = 0;

		System.out.print("Please Enter the size of the Array :");
		float arraySize = scan.nextInt();
		int[] numValue = new int[(int) arraySize];

		System.out.print("Please Enter the array values :");
		for (int i = 0; i < arraySize; i++) {
			numValue[i] = scan.nextInt();

		}
		for (int i = 0; i < arraySize; i++) {

			sum = sum + numValue[i];

		}

		System.out.println("Average:" + (sum / arraySize));
		scan.close();
	}
}