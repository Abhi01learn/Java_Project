package validation;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int 
		String inputString = "MADAM";
		char[] inputchar = inputString.toCharArray();

		boolean flag = true;
		int i = 0;
		int j = inputchar.length - 1;

		while (i < j) {

			if (inputchar[j] != inputchar[i]) {
				i++;
				j--;
				flag = false;
			} else {
				break;
			}

		}
		if (flag == false) {
			System.out.println(inputString + " is not palindrome");
		} else {
			System.out.println(inputString + " is palindrome");
		}

	}

}
