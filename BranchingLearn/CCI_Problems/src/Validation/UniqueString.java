package Validation;

public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = " abcdefghijklmnopqrstuvwxypz";

		inputString = inputString.trim();
		inputString = inputString.toUpperCase();
		inputString = inputString.replaceAll(" ", "");
		boolean flag = false;
		char temp = 0 ;

		char[] charArray = inputString.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray.length; j++) {
				if (i == j) {
					continue;
				} else if (charArray[i] == charArray[j]) {
					flag = true;
					temp = charArray[i];
					break;
				}
			}
		}
		if (flag == false) {
			System.out.println("All the character in the string are unique");
		} else {
			System.out.println("All the character in the string are NOT unique "+temp+" is repeted.");
		}
	}
}