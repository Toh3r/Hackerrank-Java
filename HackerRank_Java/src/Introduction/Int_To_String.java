// https://www.hackerrank.com/challenges/java-int-to-string/problem

package Introduction;

import java.util.Scanner;

public class Int_To_String {
	public static void main(String[] args) {

		  Scanner in = new Scanner(System.in);
		  int n = in .nextInt();
		  in.close();
	   
		  /*******************************/
		  String s = Integer.toString(n);
		  /*******************************/
		   
		  if (n == Integer.parseInt(s)) {
			  System.out.println("Good job");
		  } else {
			  System.out.println("Wrong answer.");
		  }

	}
}
