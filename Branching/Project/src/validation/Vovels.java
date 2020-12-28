package validation;

import java.util.Scanner; 

public class Vovels {
	static String inputString = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =  new Scanner(System.in);
		inputString = scanner.nextLine();
		System.out.println("Input string is :"+inputString);
		
		if (inputString.contentEquals("a")||inputString.contentEquals("A")||inputString.contentEquals("e")||
				inputString.contentEquals("E")||inputString.contentEquals("i")||inputString.contentEquals("I")||
				inputString.contentEquals("o")||inputString.contentEquals("O")||inputString.contentEquals("u")||
				inputString.contentEquals("U"))
{
			System.out.println("The entered string is a vovel");
		}
		
		else {
			System.out.println("The entered string a consonant");
		}
		
		
	}

}
