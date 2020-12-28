package validation;

import java.util.Scanner; 

//import java.util.Scanner;
public class EvenOdd {
	static int fi=0;
	int second=0;
	int third=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner firstInt =  new Scanner(System.in);
		fi = firstInt.nextInt();
		System.out.println("You entered : "+fi);
		if (fi %2 ==0) {
			
			System.out.println("Number is even");
			
		}
		else {
			System.out.println("Number is odd");
		}
		
	}

}
