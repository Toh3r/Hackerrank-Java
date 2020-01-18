// https://www.hackerrank.com/challenges/java-loops/problem
// -> https://www.youtube.com/watch?v=MgtCYrFWXdk

package Introduction;

import java.util.Scanner;

public class Loops_II {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // Loop n times
            for (int j=0; j<n; j++) {
                a += b;
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(a);
                b = b*2;
            }
            System.out.print("\n");
        }
        in.close();
    }
}
