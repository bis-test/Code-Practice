//@author- Biswajit Sundara
//@Date- 05/11/2018
//@Program - Java program to print patterns based on number divisible.
//@Day-10
//@Code-1
//@Satus-Complete

/*
Wtite a java program to get two user inputs numbers(a and b)
from user and print the numbers from a to b in the following pattern

1.If the number is divisible by 3 print FIZZ
2.If the number is divisible by 5 print BUZZ
3.If the number is divisible by 3 and 5 print FIZZBUZZ
4.If not divisible by 3 or 5 then print the number itself

Input Numbers: 8 16
Output: 8 FIZZ BUZZ 11 FIZZ 13 14 FIZZBUZZ 16

 */

package testleaf.java;

import java.util.Scanner;

public class D10C1NumbersInPattern {

	public static void main(String[] args) {

		//1.Instantiate scanner class
		Scanner sc= new Scanner(System.in);

		//2.Read starting number from the user
		System.out.println("Enter the starting number:");
		int start= sc.nextInt();

		//3.Read starting number from the user
		System.out.println("Enter the ending number:");
		int end= sc.nextInt();

		//4.Using the for loop check divisible by 3 or 5
		for(int i=start;i<=end;i++)
		{
			if ((i%3==0) & (i%5!=0))
			{
				System.out.println("FIZZ");
			}

			if ((i%5==0) & (i%3!=0))
			{
				System.out.println("BUZZ");
			}

			if((i%3==0) & (i%5==0))
			{
				System.out.println("FIZZBUZZ");
			}

			if((i%3!=0) & (i%5!=0))
			{
				System.out.println(i);
			}
		}


		//5.Close the scanner object
		sc.close();

	}

}
