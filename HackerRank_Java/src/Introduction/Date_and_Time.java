// https://www.hackerrank.com/challenges/java-date-and-time/problem

package Introduction;

import java.io.*;
import java.util.*;

class Result {


    public static String findDay(int month, int day, int year) {

        Calendar c = Calendar.getInstance();
        c.set(year, month -1, day);
        String dayOfWeek = c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase();
        return dayOfWeek;

    }

}

public class Date_and_Time {
	
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int month = Integer.parseInt(firstMultipleInput[0]);

	        int day = Integer.parseInt(firstMultipleInput[1]);

	        int year = Integer.parseInt(firstMultipleInput[2]);

	        String res = Result.findDay(month, day, year);

	        bufferedWriter.write(res);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }

}
