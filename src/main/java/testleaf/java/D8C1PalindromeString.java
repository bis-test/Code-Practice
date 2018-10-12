//@author- Biswajit Sundara
//@Date- 05/10/2018
//@Program - Java program to check if the string is palindrome
//@Day-8
//@Code-1
//@Satus-Complete

/*
 Below code uses prebuilt methods. If the interviewer asks for another approach
 		int length = str.length();
 		for ( int i = length - 1; i >= 0; i-- )
        rev = rev + str.charAt(i);  
 */

package testleaf.java;

import java.util.Scanner;

public class D8C1PalindromeString {

	public static void main(String[] args) {
		
		//1.Instantiate the scanner class
		Scanner sc= new Scanner(System.in);
		
		//2.Read the string from user
		System.out.println("Enter the string:");
		String str= sc.next();
		
		//3.Reverse the string
		String reverse= new StringBuffer(str).reverse().toString();
		
		
		//4.Check if the string matches with the reversed string
		if(str.equals(reverse))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
		
		//5.Close the scanner object
		sc.close();
		
		

	}

}
