package validation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadAtxtFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("******* Reading a file *******");

		File readFile = new File("D:\\Java-Files\\Data.txt");

		Scanner scanner = new Scanner(readFile);

		List<String> dataList = new ArrayList<String>(50);
		while (scanner.hasNextLine()) {

			dataList.add(scanner.nextLine());
			System.out.println(dataList);
		}

		System.out.println("******* create and a .txt file *******");

		File createFile = new File("D:\\Java-Files\\DataWrite.txt");

		if (createFile.createNewFile()) {
			System.out.println("File Created : " + createFile.getName());
		} else {
			System.out.println("File already exist!");
		}

		System.out.println("******* Write a file *******");

		FileWriter fileWriter = new FileWriter(createFile);

		String stringData = dataList.toString();
		char[] charArray = stringData.toCharArray();
		for (int i = 1; i < charArray.length - 1; i++) {

			if (charArray[i] == ',' && charArray[i + 1] == ' ') {
				fileWriter.write("\n");

			} else if (charArray[i] == ' ' && charArray[i - 1] == ',') {
				continue;

			} else {
				fileWriter.write(charArray[i]);

			}

		}
		fileWriter.close();

		System.out.println("File is written!!");

	}

}
