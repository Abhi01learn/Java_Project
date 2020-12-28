package validation;

public class CapitalFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "getting in deapth in string";

		char[] charinput = inputString.toCharArray();

		int size = charinput.length;
		charinput[0] = (char) (charinput[0] - 32);
		System.out.println(charinput);

		int i = 1;
		while (i != size) {
			if (charinput[i] == ' ') {
				charinput[i + 1] = (char) (charinput[i + 1] - 32);
			}
			i++;
		}
		System.out.println(charinput);

	}

}
