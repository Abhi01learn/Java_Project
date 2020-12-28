package validation;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "12";
		long num = Integer.parseInt(input);
		long x = num / 2;
		System.out.println(x);
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;

			}

		}
		if (flag == true) {
			System.out.println(num + " not prime");
		} else {
			System.out.println(num + " is  prime");
		}
	}

}
