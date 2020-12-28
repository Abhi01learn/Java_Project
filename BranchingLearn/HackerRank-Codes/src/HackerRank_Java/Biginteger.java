/**
 * 
 */
package HackerRank_Java;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Abhishek
 *
 */
public class Biginteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		BigInteger A = scanner.nextBigInteger();
		BigInteger B = scanner.nextBigInteger();
		BigInteger c = A.add(B);
		BigInteger d = A.multiply(B);
		System.out.println(c);
		System.out.println(d);
		

	}

}
