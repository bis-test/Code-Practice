//author-Biswajit Sundara
//@date - 10/12/2018
//@code - Sort an array of strings/words in ascending or descending.


package codes.strings;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayWords {

	public static void main(String[] args) {

		String arr[] = {"practice.geeksforgeeks.org", 
				"quiz.geeksforgeeks.org", 
				"code.geeksforgeeks.org"
		}; 


		// Sorts arr[] in ascending order 
		Arrays.sort(arr); 
		System.out.printf("Array in ascending order: \n%s\n\n ", Arrays.toString(arr)); 

		// Sorts arr[] in descending order 
		Arrays.sort(arr, Collections.reverseOrder()); 

		System.out.printf("Array in descending order: \n%s\n\n ", Arrays.toString(arr)); 

	}

}
