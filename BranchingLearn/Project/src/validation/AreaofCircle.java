package validation;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter radius: ");
		Scanner scan = new Scanner(System.in);
		int radius = scan.nextInt();
		
		double area = Math.PI * radius * radius;
		System.out.println("Area of circle" + area);
		double cir = Math.PI * 2 * radius;
		System.out.println("the Circumference is :" + cir);
		scan.close();
	}

}
