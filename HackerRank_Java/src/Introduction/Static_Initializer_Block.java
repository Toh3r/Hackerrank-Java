// https://www.hackerrank.com/challenges/java-static-initializer-block/problem

package Introduction;

import java.util.Scanner;

public class Static_Initializer_Block {
	// Create static variables
	static int B;
	static int H;
	static boolean flag;

	// Create Static Initializer Block
	static {
	    // Read input
	    Scanner in = new Scanner(System.in);
	    System.out.print("Enter Breadth: ");
	    B = in.nextInt();
	    System.out.print("Enter Height: ");
	    H = in.nextInt();
	    in.close();

	    // If area is minus, print error
	    // Else pass numbers to main
	    if (B<=0 || H<=0) {
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	        flag = false;
	    } else {
	        flag = true;
	    }
	}

	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}//end of main
}
