package validation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddNumberInAFile {

	public static void main(String[] args) throws FileNotFoundException {

		// calculate the average value of an array

		File file = new File("D:\\Java-Files\\Data.txt");
		int counter = 0;
		float intTemp = 0;
		float sum = 0;
		float average = 0;

		Scanner scanner = new Scanner(file);

		while (scanner.hasNextInt()) {

			intTemp = scanner.nextInt();
			sum = sum + intTemp;

			counter++;
			// System.out.println(counter);

		}
		System.out.println(sum);
		System.out.println(counter);
		average = sum / counter;
		System.out.println("Average " + average);
		scanner.close();
	}

}
