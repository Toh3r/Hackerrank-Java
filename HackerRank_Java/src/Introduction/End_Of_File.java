// https://www.hackerrank.com/challenges/java-end-of-file/problem

package Introduction;

import java.util.Scanner;

public class End_Of_File {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1; // Create counter
        while (in.hasNext()) {
            System.out.println(i + " " + in.nextLine());
            i++; // Increment counter
        }
        in.close();
    }
}
