//@author- Biswajit Sundara
//@Date- 05/08/2018
//@Program - Java program to find sum of the numbers
//@Day-6
//@Code-1
//@Satus-Complete

/*
    Sample Input: Enter the values: 25,26,9,18,3,12

    Sample Output: Sum of numbers in the array:93

 */


package testleaf.java;

import java.util.Scanner;

public class D6C1SumOfNumbers {

	public static void main(String[] args) {


		//Declare Variable
		int n;
		int i;
		int sum=0;


		//Instantiate scanner class
		Scanner sc= new Scanner(System.in);


		//Enter the number upto which we will check the prime numbers
		System.out.println("Enter the value of n:");
		n= sc.nextInt();
		int numbers[] = new int[n];

		
		//Read numbers from the user
		System.out.println("Enter numbers");
		for(i=0;i<n;i++)
		{
			numbers[i]= sc.nextInt();
		}

		
		//Using for loop add each number from the array
		for(i=0;i<n;i++)
		{
			sum=sum+numbers[i];
		}

		
		//Print the sum
		System.out.println("Sum of numbers in the array= "+sum);	

		
		//Close the scanner object
		sc.close();
	}

}
