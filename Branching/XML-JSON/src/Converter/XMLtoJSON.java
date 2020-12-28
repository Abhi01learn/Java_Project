package Converter;
import java.io.File;
import java.util.Scanner;
import org.json.*

public class XMLtoJSON {
	
	
	
	
	public static void main(String[] args) throws Exception {
		
	
	
	File file = new File("E:\\XMLtoJSON\\InputXML.txt");
	Scanner scan = new Scanner(file);
	while (scan.hasNextLine()) {
		System.out.println(scan.nextLine());
		}
	}
	

}