package validation;

public class ReverseStringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wordString = "Madam";

		StringBuilder revStringBuilder = new StringBuilder();
		revStringBuilder.append(wordString);

		String revString = revStringBuilder.reverse().toString();
		System.out.println(revStringBuilder);

		if (revString.equalsIgnoreCase(wordString)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
