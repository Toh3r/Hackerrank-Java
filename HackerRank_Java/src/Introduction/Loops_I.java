// https://www.hackerrank.com/challenges/java-loops-i/problem

package Introduction;

import java.util.Scanner;

public class Loops_I {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
    	// Read input from user
    	System.out.print("Please Enter a number: ");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        // Loop 10 times
        for (int i=1; i<11; i++) {
        	// Print to console
            System.out.println(N + " x " + i + " = " + N*i);
        }

        scanner.close();
    }

}
