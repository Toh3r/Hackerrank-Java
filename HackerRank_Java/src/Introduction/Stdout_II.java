// https://www.hackerrank.com/challenges/java-stdin-stdout/problem

package Introduction;

import java.util.Scanner;

public class Stdout_II {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read Input
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Clear buffer
        String s = scan.nextLine();
        
        // Print output
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close(); // Close Scanner
    }
}
