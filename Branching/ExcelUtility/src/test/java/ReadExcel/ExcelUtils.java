package ReadExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static void main(String[] args) throws IOException, InvalidFormatException {
		// TODO Auto-generated method stub
		System.out.println("******* Reading a .xlsx file *******");

		// String fileLocation = "D:\\Java-Files\\Data.xlsx";
		String fileLocation = "./Data/Data.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook(fileLocation);
		XSSFSheet sheet = workbook.getSheetAt(0);

		DataFormatter formatData = new DataFormatter();

		int totalRows = sheet.getPhysicalNumberOfRows();
		System.out.println(totalRows);

		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getFirstRowNum());
		System.out.println(sheet.getRow(0).getLastCellNum());
		/*
		 * @Author : Abhishek Pandey
		 * 
		 * @Date :03/07/2020
		 * 
		 * @Printing the data present in the sheet
		 */

		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {

			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {

				System.out.println(formatData.formatCellValue(sheet.getRow(i).getCell(j)) + "   "
						+ formatData.formatCellValue(sheet.getRow(i).getCell(j + 1)) + "   "
						+ formatData.formatCellValue(sheet.getRow(i).getCell(j + 2)) + "   "
						+ formatData.formatCellValue(sheet.getRow(i).getCell(j + 3)) + "   "
						+ formatData.formatCellValue(sheet.getRow(i).getCell(j + 4)));
				break;
			}
		}
		/*
		 * @Author : Abhishek Pandey
		 * 
		 * @Date :03/07/2020
		 * 
		 * @Printing a specific column from the sheet
		 */
		int k = 0;

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				String cellvalue = formatData.formatCellValue(sheet.getRow(i).getCell(j));

				if (cellvalue.contentEquals("E Name")) {
					k = j;
					System.out.println("k :" + k);

				}
			}
			if (i < sheet.getPhysicalNumberOfRows() - 1) {
				String value = formatData.formatCellValue(sheet.getRow(i + 1).getCell(k));
				System.out.println(value);

			} else {
				break;
			}
		}
		/*
		 * @Author : Abhishek Pandey
		 * 
		 * @Date :03/07/2020
		 * 
		 * @ create and a .xlsx file
		 */

		System.out.println("******* create and a .xlsx file *******");

		File createFile = new File("D:\\Java-Files\\DataWrite.xlsx");

		if (createFile.createNewFile()) {
			System.out.println("File Created : " + createFile.getName());
		} else {
			System.out.println("File already exist!");
		}
		
		/*
		 * @Author : Abhishek Pandey
		 * 
		 * @Date :03/07/2020
		 * 
		 * @ create and a .xlsx file
		 */
		Workbook workbook2 = new XSSFWorkbook(createFile);
		Sheet sh = (Sheet) workbook2.createSheet("Employee_Details");
		
		
		//System.out.println(sheet.createTable());
		
		

	}
}