package validation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.util.ArrayList;

public class Depawali {

	public static void main(String[] args) throws IOException {
		
		for (int i = 0; i >= 0; i++) {
			
			if (i==0) {
				System.out.println("                                                                   ");
				System.out.println("                                               *                       ");
				System.out.println("                                             ***                       ");
				System.out.println("                                            ****                       ");
				System.out.println("                                           ****                       ");
				System.out.println("                                          *****                       ");
				System.out.println("                                          *****                       ");
				System.out.println("                                          ****                       ");		
				System.out.println("                                          ****                       ");
				System.out.println("                                          ****                       ");
				System.out.println("                                           **                       ");
				System.out.println("                                          *     ");
				System.out.println("                                        **     ");
				System.out.println("                                     **** ");
				System.out.println("       *********************************     ");
				System.out.println("        ******************************    ");		
				System.out.println("          ***************************    ");
				System.out.println("           ************************    ");
				System.out.println("              *******************   ");
				System.out.println("                ****************    ");

				System.out.println();
				System.out.println("               Happy Dipavali 2020               ");
				System.out.println("                 Abhishek Pandey               ");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
		
				clrscr();
				System.out.println(new String(new char[2500]).replace("\0", "\r\n"));
			}
			else {
				System.out.println("                                                                   ");
				System.out.println("                                              *                       ");
				System.out.println("                                            ***                       ");
				System.out.println("                                            ****                       ");
				System.out.println("                                            ****                       ");
				System.out.println("                                            *****                       ");
				System.out.println("                                            *****                       ");
				System.out.println("                                            ****                       ");		
				System.out.println("                                            ****                       ");
				System.out.println("                                           ****                       ");
				System.out.println("                                          **                       ");
				System.out.println("                                          *     ");
				System.out.println("                                        **     ");
				System.out.println("                                     **** ");
				System.out.println("       *********************************     ");
				System.out.println("        ******************************    ");		
				System.out.println("          ***************************    ");
				System.out.println("           ************************    ");
				System.out.println("              *******************   ");
				System.out.println("                ****************    ");

				System.out.println();
				System.out.println("               Happy Dipavali 2020               ");
				System.out.println("                 Abhishek Pandey               ");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
				i=i-2;
				clrscr();
				System.out.println(new String(new char[2500]).replace("\0", "\r\n"));
			}
			
			
		}


		
	}
	
	public static void clrscr() {
		try {
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor(100000, TimeUnit.MICROSECONDS);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
