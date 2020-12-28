package validation;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Abhishek is a sexy boy";
		String s2 = "Abhishek is a  boy   sexy";

		s1 = s1.replaceAll(" ", "");

		System.out.println(s1);

		s2 = s2.replaceAll(" ", "");

		String A1 = s1.toUpperCase();
		String A2 = s2.toUpperCase();

		char[] a = A1.toCharArray();
		System.out.println(a[4]);
		char[] b = A2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(a);
		System.out.println(b);
		boolean result = Arrays.equals(a, b);
		if (result == true) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}
}
