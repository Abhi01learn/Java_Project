package validation;

public class SumofAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "19875";
		int sum=0;
		//char num1[]= num.toCharArray();
		System.out.println(num.length());
		
		for (int i = 0; i <=num.length()-1 ; i++) {	
			System.out.println("aaaa"+sum);
			System.out.println(num.charAt(i));
			sum = num.charAt(i);
			System.out.println("*******"+sum);
					
			
		}
		System.out.println(sum);

	}

}
