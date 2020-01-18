// https://www.hackerrank.com/challenges/java-string-reverse/problem

package Strings;

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        
        // Create reversed string using string builder
        String reverse_str = new StringBuilder(A).reverse().toString();
        
        // Use compareTo
        String ans = (A.compareTo(reverse_str) == 0) ? "Yes" : "No";
        System.out.println(ans);
    }

}
