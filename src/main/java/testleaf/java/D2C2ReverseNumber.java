//@author- Biswajit Sundara
//@Date- 05/02/2018
//@Program - Simple java program to reverse the given number
//@Day-2
//@Code-1
//@Status-Complete

/*
    Sample Input: Enter number1=649

    Sample Output: The reversed number is= 946                   
 */


package testleaf.java;

import java.util.Scanner;

public class D2C2ReverseNumber {

	public static void main(String[] args) {

		
		//Declare Variable
		int number;
		int revnumber=0;
		int quo,rem;

		//Instantiate Scanner Class
		Scanner sc= new Scanner(System.in);

		//Read the number
		System.out.println("Enter a number");
		number= sc.nextInt();


		//Using loop reverse the number
		while (number>0)
		{
			quo= number%10;
			rem = number/10;

			revnumber=(revnumber*10)+quo;
			number=number/10;

		}

		//Print the reversed number 
		System.out.println("The reversed number=" + revnumber);
		
		//Close the scanner object
		sc.close();

	}


}
