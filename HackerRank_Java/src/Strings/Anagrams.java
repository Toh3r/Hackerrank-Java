// https://www.hackerrank.com/challenges/java-anagrams/problem

package Strings;

import java.util.*;

public class Anagrams {
	
    static boolean isAnagram(String a, String b) {
    	// Put each string in char array
        char[] a_arr = a.toCharArray();
        char[] b_arr = b.toCharArray();
        
        // Sort arrays
        Arrays.sort(a_arr);
        Arrays.sort(b_arr);
        
        // Convert back to string
        String a_sort = String.valueOf(a_arr);
        String b_sort = String.valueOf(b_arr);
        
        // Compare sorted strings
        return (a_sort.compareTo(b_sort) == 0); 
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}

//static boolean isAnagram(String a, String b) {
//
//    // If not equal length, return false
//    if (a.length() != b.length()) return false;
//
//    a = a.toLowerCase();
//    b = b.toLowerCase();
//
//    // Create array to hold frequenies of each character
//    int[] char_freq = new int[26];
//
//    // Increment value in char array for each char in a
//    for (int i=0;i<a.length(); i++){
//        char current = a.charAt(i);
//        int index = current - 'a';
//        char_freq[index]++;
//    }
//
//    // Decrement for each char in b
//    for (int i=0;i<b.length(); i++){
//        char current = b.charAt(i);
//        int index = current - 'a';
//        char_freq[index]--;
//    }
//
//    // If arrays values not all zero return false
//    for (int i=0; i<26; i++) {
//        if (char_freq[i] != 0) return false;
//    }
//    return true;
//    
//}
