//@author- Biswajit Sundara
//@Date- 05/04/2018
//@Program - Java program to sort an array in ascending/descending order
//@Day-4
//@Code-2
//@Status-Complete

/*
    Sample Input: Enter the numbers= 13,25,9,56,54,89,17

    Sample Output: Ascending order = 9,13,17,25,54,56,89
                   Descending order = 89,56,54,25,17,13,9

 */


package testleaf.java;

import java.util.Scanner;

public class D4C2SortAscDesc {

	public static void main(String[] args) {

		//Declare Variables
		int n;
		int i,j,temp;

		//Instantiate the scanner class
		Scanner sc= new Scanner(System.in);

		//Enter how many number you want to work with
		System.out.println("Enter the number of integers to sort");
		n= sc.nextInt();

		//Create arrays to store the numbers
		int ascArray[]= new int[n];
		int dscArray[]= new int[n];

		//Read numbers from user input and store in arrays
		System.out.println("Enter "+n+" integers ");

		for(i=0;i<n;i++)
		{
			temp=sc.nextInt();
			ascArray[i]= temp;
			dscArray[i]= temp;
		}

		//Using for loop sort the array in ascending order
		for(i=0; i<(n-1); i++)
		{
			for(j=1;j<(n-i);j++)
			{
				if(ascArray[j-1]>ascArray[j])
				{
					temp=ascArray[j-1];
					ascArray[j-1]=ascArray[j];
					ascArray[j]=temp;

				}
			}
		}


		//Print the array sorted in ascending order
		System.out.println("The sorted list of integers in ascending order");

		for(i=0;i<n;i++)
		{
			System.out.println(ascArray[i]);
		}


		//Using for loop sort the array in descending order
		for(i=0; i<(n-1); i++)
		{
			for(j=1;j<(n-i);j++)
			{
				if(dscArray[j-1]<dscArray[j])
				{
					temp=dscArray[j-1];
					dscArray[j-1]=dscArray[j];
					dscArray[j]=temp;

				}
			}
		}


		//Print the array sorted in descending order
		System.out.println("The sorted list of integers in descending order");

		for(i=0;i<n;i++)
		{
			System.out.println(dscArray[i]);
		}


		//Close the scanner object
		sc.close();	

	}

}
