package validation;

public class RecursionBasic {
	// Recursion
		public static void main(String[] args) {
			int numLength = 10;
			System.out.println("The Sum of the numbers are :" + add(numLength));
			System.out.println("The power of the numbers are :" + power(5, 5));
		}

		public static int add(int num) {
			System.out.println(num);
			if (num == 0) {
				return 0;
			}
			int sum = 0;
			sum = num + add(num - 1);
			System.out.println("***" + sum);
			return sum;
		}

		public static int power(int base, int pow) {
			int res = 1; 
			if (pow == 0) {
				return 1;

			}

			base = base * power(base, pow - 1);
			/*
			 * while (pow>=1) { res = res*base; pow--; }
			 */

			return base;
		}

}
