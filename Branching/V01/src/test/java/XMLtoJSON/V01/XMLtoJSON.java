package XMLtoJSON.V01;

import java.io.File;
import java.io.Reader;
import java.util.Scanner;

import org.json.JSONObject;
import org.json.XML;

public class XMLtoJSON {
	public static void main(String[] args) throws Exception {
		
		
		
		File file = new File("E:\\XMLtoJSON\\InputXML.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
			}
		try {
			JSONObject jsonObject = XML.toJSONObject(scan.toString());
			String xmltoJSONString = jsonObject.toString(0);
			System.out.println("11111"+xmltoJSONString);
			
			
			
		} catch (Exception e) {
			System.out.println("*****"+e.toString());
			// TODO: handle exception
		}
		
		}
	

}
