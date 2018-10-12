//@author- Biswajit Sundara
//@Date- 05/01/2018
//@Program - Simple java program to find to find the largest of three numbers
//@Day-1
//@Code-1
//@Status-Complete

/*
    Sample Input: Enter number1=5
                  Enter number2=3
                  Enter number3=9

    Sample Output:9 is the largest number                   
 */


package testleaf.java;

import java.util.Scanner;

public class D1C1LargestNumber {

	public static void main(String[] args) {

		//Declare variables
		int number1;
		int number2;
		int number3;

		//Initialize the scanner object
		Scanner sc= new Scanner(System.in);

		//Read user inputs
		System.out.println("Enter Number1=");
		number1= sc.nextInt();

		System.out.println("Enter Number2=");
		number2= sc.nextInt();

		System.out.println("Enter Number3=");
		number3= sc.nextInt();

		if(number1>number2 && number1>number3)
		{
			System.out.println(+number1+"is the largest number");
		}

		else if(number2>number1 && number2>number3)
		{
			System.out.println(+number2+"is the largest number");
		}

		else if(number3>number1 && number3>number2)
		{
			System.out.println(+number3+" is the largest number");
		}


		//close the scanner object
		sc.close();

	}

}
