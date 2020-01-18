// https://www.hackerrank.com/challenges/java-substring/problem

package Strings;

import java.util.Scanner;

public class Substring {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        
        // Create substring
        String substr = S.substring(start, end);
        
        // Print to console
        System.out.println(substr);
    }
}
