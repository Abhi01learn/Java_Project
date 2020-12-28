package validation;

import java.util.HashSet;

public class DuplicateIntSorting {
	public static void main(String[] args) {
		int[] intArray = { 1,2,3,1,2,3,1,5};
		HashSet<Integer> intSet = new HashSet<Integer>();
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				if (i == j) {
					continue;
				} else {
					if (intArray[i] == intArray[j]) {
						intSet.add(intArray[i]);
					}
				}

			}
		}
		System.out.println("Total Duplicate: " + intSet.size());
		System.out.println("Duplicate Values :" + intSet);
	}
}
