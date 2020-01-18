// https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem

package Introduction;

import java.util.Scanner;

public class Stdout_I {
	public static void main(String[] args) {
        // Create new scanner
        Scanner scan = new Scanner(System.in);

        // Get input
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        // Print to console
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Close Scanner
        scan.close();        
    }

}
