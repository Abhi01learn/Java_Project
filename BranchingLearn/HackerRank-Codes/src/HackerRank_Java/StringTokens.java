package HackerRank_Java;

import java.util.*;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "He is a very very good boy, isn't he?";
		String delim = "[ ,\\!?']+";
		String[] token = A.split(delim);
		System.out.println(token.length);
		for (int i = 0; i < token.length; i++) {
			System.out.println(token[i]);
			
		}
	}

}
