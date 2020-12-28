package HackerRank_Java;

public class Java_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		String A = "hello";
		String B = "java";

		// Printing the length of the string
		int length = A.length() + B.length();
		System.out.println(length);

		char[] C = A.toCharArray();
		char[] D = B.toCharArray();

		// lexicographical validation
		if (C[0] > D[0]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		// Capitalize the first letter in and and print them on a single line, separated
		// by a space

		String Capital = A.substring(0, 1).toUpperCase()+A.substring(1, A.length()) + " " + B.substring(0, 1).toUpperCase()+B.substring(1, B.length());
		System.out.println(Capital);

	}

}
