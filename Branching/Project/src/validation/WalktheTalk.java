package validation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.util.ArrayList;

public class WalktheTalk {

	public static void main(String[] args)  {
		
		for (int i = 1; i <= 100; i++) {
			
			if (i%3==0 && i%7==0) {
				
				System.out.println(i+": FizzBuzz");	
				continue;
			}
			else if (i%3==0) {				
				System.out.println(i+": Fizz");	
				continue;
			}
			else if (i%7==0) {				
				System.out.println(i+": Buzz");	
				continue;
			}
			
			else {
				System.out.println(i);
			}
			
		}
		
	}
}
