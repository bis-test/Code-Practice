//@author-Biswajit Sundara
//@date- 10/12/2018
//@code - Java program to sort a string alphabetically 


package codes.strings;

import java.util.Arrays;

public class SortCharactersString {

	public static void main(String[] args) {

		String str = "geeksforgeeks";

		// convert input string to char array 
		char tempArray[] = str.toCharArray(); 

		// sort tempArray 
		Arrays.sort(tempArray); 

		// return new sorted string 
		System.out.println(tempArray);


	}

}
