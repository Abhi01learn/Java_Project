package HackerRank_Java;

public class LexicographicalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String inputString = "welcometojava";
		char[] wordStrings = null;
		
		System.out.println(inputString);
		for (int i = 0; i < inputString.length(); i++) {
			for (int j = 2; j < inputString.length(); j++) {
				wordStrings = inputString.substring(i, j).toCharArray();
				
				
			}
			
		}
		System.out.println(wordStrings[3]);
		

	}

}
