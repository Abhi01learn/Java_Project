package Projects;

import java.util.HashMap;

public class Amazon_FirstNonRepeatingChar {
	public static void main(String[] args) {

		String inputString = "winniwtak";
		
		char[] charArray = inputString.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int i = 0;
		// System.out.println(charArray.length);
		while (i != charArray.length) {
			if (map.containsKey(charArray[i]) == false) {
				map.put(charArray[i], 1);

			} else {
				int oldVal = map.get(charArray[i]);
				int newVal = oldVal + 1;
				map.put(charArray[i], newVal);
			}
			i++;
		}
		System.out.println(map);
		for (int k = 0; k < inputString.length(); k++) {
			char word = inputString.charAt(k);
			if (map.get(word)==1) {
				System.out.println("First Non repeating in the String is '"+word+"'");
				break;
			}
			
		}

	}

}
