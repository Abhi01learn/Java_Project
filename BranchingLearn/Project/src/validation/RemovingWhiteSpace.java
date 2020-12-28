package validation;

import java.util.Iterator;

public class RemovingWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "I am a good Boy";

		for (int i = 0; i < inputString.length() - 1; i++) {
			if (inputString.contains(" ")) {
				// i
			}
			System.err.println(inputString.charAt(i));

		}

	}
}
