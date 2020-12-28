package Validation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class OneEditsC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring the strings

		String firstString = "abhishek";
		String secString = "zbhishek";
		int counter = 0;

		// Storing the input string in a char array
		char[] firstCharArray = firstString.toCharArray();
		char[] secondCharArray = secString.toCharArray();

		/*
		 * //Sorting the array in alphabetical order Arrays.sort(firstCharArray);
		 * Arrays.sort(secondCharArray);
		 */

		// Creating a HashSet
		HashSet<Character> charHashSet1 = new HashSet<Character>();
		HashSet<Character> charHashSet2 = new HashSet<Character>();

		// Case 1: Zero Edits Needed.
		if (firstString.length() == secString.length() && firstString.equals(secString)) {
			System.out.println("Zero edits needed : TRUE");
		}

		else if (firstString.length() == secString.length() && firstString != secString) {
			System.out.println("not equal you know : ");
			for (int i = 0; i < firstCharArray.length; i++) {
				for (int j = 0; j < secondCharArray.length; j++) {
					
						if (firstCharArray[i] != secondCharArray[j]) {
							charHashSet1.add(firstCharArray[i]);
							charHashSet2.add(secondCharArray[j]);
							counter++;

						
					}

				}

			}
			
			
			
			
			System.out.println("charSet1" + charHashSet1);
			System.out.println("charSet2" + charHashSet2);
			

		} else {
			System.out.println("Not Equal");
		}

	}

}