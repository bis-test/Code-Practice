//@author- Biswajit Sundara
//@Date- 05/02/2018
//@Program - Simple java program to check if the given number is palindrome or not
//@Day-2
//@Code-1
//@Status-Complete

/*
    Sample Input: Enter number1=649

    Sample Output: The Given Number is Palindrome                 
 */



package testleaf.java;

import java.util.Scanner;

public class D2C1Palindrome {

	public static void main(String[] args) {


		//Declare Variable
		int number;
		int temp;
		int revnumber=0;
		int quo,rem;

		//Instantiate Scanner Class
		Scanner sc= new Scanner(System.in);

		//Read the number
		System.out.println("Enter a number");
		number= sc.nextInt();

		//Copy the number to a temp variable
		temp=number;

		//Using loop reverse the number
		while (number>0)
		{
			quo= number%10;
			rem = number/10;

			revnumber=(revnumber*10)+quo;
			number=number/10;

		}

		//copy the number from the temp variable
		number=temp;

		//Check if the number & the reversed number are same
		if(number==revnumber)
		{
			System.out.println("The Given number is palindrome");
		}

		else
		{
			System.out.println("The Given number is not palindrome");
		}


		//Close the scanner object
		sc.close();

	}

}
