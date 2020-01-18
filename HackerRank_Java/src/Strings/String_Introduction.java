// https://www.hackerrank.com/challenges/java-strings-introduction/problem

package Strings;

import java.util.Scanner;

public class String_Introduction {
	
    public static void main(String[] args) {
        
        // Input 2 words
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first word: ");
        String A=sc.next();
        System.out.print("Enter second word: ");
        String B=sc.next();
        sc.close();

        // Add length of each together
        int string_sum = A.length() + B.length();

        // Compare words
        String string_comp = A.compareTo(B) > 0 ? "Yes" : "No";

        // Capitalize first word of each letter
        String a_cap = A.substring(0, 1).toUpperCase() + A.substring(1);
        String b_cap = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Print to Console
        System.out.println(string_sum);
        System.out.println(string_comp);
        System.out.println(a_cap + " " + b_cap);
    }

}
