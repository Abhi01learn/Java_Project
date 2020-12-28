package validation;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class DuplicateStringSorting {

	public static void main(String[] args) {
		String str = "I I am am am learning java java am";

		String[] strarr = str.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < strarr.length; i++) {
			if (map.containsKey(strarr[i]) == true) {
				int oldval = map.get(strarr[i]);
				int newval = oldval + 1;
				map.put(strarr[i], newval);
			} else {
				map.put(strarr[i], 1);
			}
		}

		for (int i = 0; i < strarr.length; i++) {

			String str1 = strarr[i];

			if (map.get(str1) > 1 && list.contains(str1) == false) {
				System.out.println(str1 + " " + map.get(str1));
				list.add(str1);

			}

		}

	}

}
