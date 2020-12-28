package validation;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

//import com.sun.security.auth.NTDomainPrincipal;

@SuppressWarnings("unused")
public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameString = LocalDate.of(1991, 01, 24).getDayOfWeek().name();
		System.out.println(nameString);

		/*
		 * Scanner scanner = new Scanner(System.in); double payment =
		 * scanner.nextDouble(); scanner.close();
		 * 
		 * // Write your code here. Locale indiaLocale = new Locale("en", "IN");
		 * 
		 * NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		 * 
		 * NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
		 * 
		 * NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		 * 
		 * NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		 * 
		 * System.out.println("US: " + us.format(payment)); System.out.println("India: "
		 * + india.format(payment)); System.out.println("China: " +
		 * china.format(payment)); System.out.println("France: " +
		 * france.format(payment));
		 * 
		 * }
		 */

	}
}