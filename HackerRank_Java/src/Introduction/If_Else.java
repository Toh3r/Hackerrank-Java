// https://www.hackerrank.com/challenges/java-if-else/problem

package Introduction;

import java.util.Scanner;

public class If_Else {
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
    	System.out.print("Please enter a number: ");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        // If number is odd or between 6 and 20 print out
        // Else print even
        if (N%2 != 0 || (N>=6 && N<=20)){
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        scanner.close();
    }

}
