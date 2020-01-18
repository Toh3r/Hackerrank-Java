// https://www.hackerrank.com/challenges/java-currency-formatter/problem

package Introduction;

import java.util.*;
import java.text.*;

public class Currency_Formatter {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Get format for India
        Locale indiaLocale = new Locale("en", "IN");
        
        // Format Numbers for each currency
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        // Print to console
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }

}
