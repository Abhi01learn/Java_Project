package validation;

import java.util.Scanner;

public class SentenceReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a sentence:");

		String input = scan.nextLine();

		StringBuilder inputchar = null; // = input.toCharArray();
		String[] outputchar = null;

		StringBuilder stringBuilder = new StringBuilder();
		outputchar = input.split(" ");
		System.out.println(outputchar[2]);

		for (int i = outputchar.length - 1; i >= 0; i--) {

			stringBuilder.append(outputchar[i]);
			if (i != 0) {
				stringBuilder.append(" ");
				
			}

		}
		System.out.println(stringBuilder.toString());
	}

}
