package validation;

import java.util.Scanner;

public class Hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter the number of the rows: ");
		int row = scan.nextInt();

		System.out.print("Please enter the number of the col: ");
		int col = scan.nextInt();

		int[][] TwoD = new int[row][col];

		System.out.println("Please enter " + (row * col) + "  element of the array: ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				TwoD[i][j] = scan.nextInt();

			}

		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(TwoD[i][j] + " ");

			}
			System.out.println();
		}

		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sum = TwoD[i][j] + TwoD[i][j + 1] + TwoD[i][j + 2] + TwoD[i + 1][j + 1] + TwoD[i + 2][j]
						+ TwoD[i + 2][j + 1] + TwoD[i + 2][j + 2];

				if (sum > maxSum) {
					maxSum = sum;
				}

			}

		}
		System.out.println("Max sum of the hourglass: " + maxSum);

	}

}