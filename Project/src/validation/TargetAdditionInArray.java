package validation;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class TargetAdditionInArray {

	public static void main(String[] args) {

		// int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] arr = { 7, 5, 10, 18 };
		int count = 0;
		int temp = 0;
		int sum = 25;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == sum) {
				System.out.println("The index is :" + i);
				count++;
				break;
			} else {
				continue;
			}
		}

		if (count == 0) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 1; j < arr.length; j++) {
					temp = arr[i] + arr[j];
					if (temp == sum) {
						System.out.println("First index :" + i + "Second Index :" + j);
						count++;
						break;
					}
				}
				if(count ==1) {
					break;
				}

			}
		}

	}

}
