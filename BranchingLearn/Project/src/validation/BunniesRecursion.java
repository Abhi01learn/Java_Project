package validation;

public class BunniesRecursion {
	// Number of ears of bunnies in a field

	public static void main (String[] args) {
		System.out.println("total ears :"+Bunnies(101));
		
	}
	
	public static int Bunnies(int num) {
		int ear =0;
		if (num == 0) {
			return 0;			
		}
		ear = 2+Bunnies(num-1);
		return ear;
		
	}

}
