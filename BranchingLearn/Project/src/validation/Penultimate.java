package validation;

import java.util.Scanner;

public class Penultimate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Please Enter a Srting : ");
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();

		int start = 0;
		int end = 0;
		int counter = 0;

		// String inputString = "I AM THE BEST";
		char[] space = inputString.toCharArray();

		int j = space.length - 1;
		System.out.println("J = " + j);
		for (int i = j; i >= 0; i--) {

			if (space[i] == ' ' && counter == 0) {
				end = i;
				counter++;
			} else if (space[i] == ' ' && counter == 1) {
				start = i;
				counter++;

			} else {

				continue;
			}

		}
		String penultimate = inputString.substring(start + 1, end);
		System.out.println("Penultimate word is :"+penultimate);

	}
}
