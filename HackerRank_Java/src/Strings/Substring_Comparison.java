// https://www.hackerrank.com/challenges/java-string-compare/problem

package Strings;

import java.util.Scanner;

public class Substring_Comparison {
    public static String getSmallestAndLargest(String s, int k) {
    	// Set smallest and largest to first substr
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        // Loop through string
        for (int i=0; i<s.length()-(k-1); i++){
        	// Create a substr of size k each time
            String substr = s.substring(i, i + k);
            // Compare with current values
            int comp1 = substr.compareTo(smallest);
            int comp2 = substr.compareTo(largest);
            // Replace values if necessary
            if (comp1 < 0)  {
                smallest = substr;
            } else if (comp2 > 0)  {
                largest = substr;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
