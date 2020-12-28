package validation;

import java.util.Scanner; 

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		
	
		if(year%4==0) {
			System.out.println("Year is a leap year");
		}
		else {
			System.out.println("Not a leap year");
		}

	}

}
