package validation;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//my logic
		int limit = 0;
		int first = 0;
		int second = 1;
		int third;
		System.out.print(first + " " + second);
		while (limit <= 9) {
			third = second + first;

			System.out.print(" " + third);

			first = second;
			second = third;
			limit++;

		}

	}
	/*
	 * // Fibonacci Recurssion static int third = 0; static int second = 1; static
	 * int first = 0;
	 * 
	 * public static void main(String[] args) {
	 * 
	 * System.out.println(first + " " + second);
	 * 
	 * WalktheTalk talk = new WalktheTalk(); talk.fibo(5); //
	 * System.out.println("Sum :"+fibo(5));
	 * 
	 * }
	 * 
	 * public static void fibo(int num) {
	 * 
	 * if (num >= 1) { third = second + first;
	 * 
	 * System.out.print(" " + third);
	 * 
	 * first = second; second = third; fibo(num - 1);
	 * 
	 * }
	 * 
	 * }
	 */

}
