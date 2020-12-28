package validation;

public class ReverseStringWithoutFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wordString = "Abhishek Pandey";
		char revString[] = wordString.toCharArray();
		for (int i = revString.length - 1; i >= 0; i--) {
			System.out.print(revString[i]);

		}
	}

}
