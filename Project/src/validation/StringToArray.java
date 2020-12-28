package validation;

import java.util.Arrays;

public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "remmargorp taerg a si kehsihba";
		inputString = inputString.replaceAll(" ", "");
		String firstString = inputString.toUpperCase();
		
		char[] charArray1 = firstString.toCharArray();

		int j = 0;
		for (int i = inputString.length() - 1; i >= 0; i--) {

			charArray1[j] = firstString.charAt(i);
			j++;

		}

		String outputString = charArray1.toString().copyValueOf(charArray1).toLowerCase();
		// System.out.println(outputString);

		outputString = outputString.replaceAll(" ", "");
		String reverseString = outputString.toUpperCase();
		System.out.println("2ND STRING IS : " + reverseString);

		char[] charArray2 = reverseString.toCharArray();
		
		Arrays.sort(charArray1);
		System.out.println("Sorted CHAR1 : "+charArray1.toString().copyValueOf(charArray1));
		Arrays.sort(charArray2);
		System.out.println("Sorted CHAR2 : "+charArray2.toString().copyValueOf(charArray2));
		
		boolean result = Arrays.equals(charArray1, charArray2);
		if (result==true) {
			System.out.println("Anagram");
			
		}
		else {
			System.out.println("Not Anagram");
		}
	}
	

}
