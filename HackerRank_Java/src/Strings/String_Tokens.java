// https://www.hackerrank.com/challenges/java-string-tokens/problem

package Strings;

import java.util.Scanner;

public class String_Tokens {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Remove any whitespace
        s = s.trim();
        // If length 0 then return
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        // Split
        String[] arr = s.split("[^a-zA-Z]+");

        // Print number of split words
        System.out.println(arr.length);

        //Print each word
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
