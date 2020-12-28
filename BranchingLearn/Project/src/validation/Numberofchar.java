package validation;

import java.util.HashMap;

public class Numberofchar {
	public static void main(String[] args) {

		String inputString = "aaabbhishek";
		inputString = inputString.toLowerCase();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		int val = 0;
		char[] charArray = inputString.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (map.containsKey(charArray[i])) {
				val = map.get(charArray[i]);
				val = val + 1;
				map.put(charArray[i], val);
			} else {
				map.put(charArray[i], 1);
			}

		}
		System.out.println(map);

	}

}
