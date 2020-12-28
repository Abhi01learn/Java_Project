package validation;

import java.util.HashSet;

public class WordCountUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "papapapaya y0";
		// inputString = inputString.replace(" ", "");
		char[] charArray = inputString.toUpperCase().toCharArray();

		HashSet<Character> charSet = new HashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray.length; j++) {
				if (i == j) {
					continue;

				} else {
					if (charArray[i] == charArray[j]) {
						charSet.add(charArray[i]);

					}
				}

			}

		}
		System.out.println("Total Duplicate : " + charSet.size());
		System.out.println("Duplicate Chaacters :" + charSet);

	}

}
