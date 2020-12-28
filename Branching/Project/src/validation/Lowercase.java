package validation;

import java.util.Scanner;

public class Lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub:

		System.out.print("Please Enter a Srting in lower case: ");
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();

		// String inputString = "I AM THE BEST";

		char[] inputchar = inputString.toCharArray();

		for (int i = 0; i < inputchar.length; i++) {
			if (inputchar[i] != ' ') {

				inputchar[i] = (char) (inputchar[i] + 32);
			} else {
				continue;
			}

		}
		System.out.println(inputchar);

	}

}
