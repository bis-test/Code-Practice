//@author- Biswajit Sundara
//@Date- 05/03/2018
//@Program - Java program to get a number in the console and print its factorial
//@Day-3
//@Code-2
//@Status-Complete

/*
    Sample Input: Enter the value of n= 100

    Sample Output: 0,1,1,2,3,5,8,13,21,34,55,89       
 */



package testleaf.java;

import java.util.Scanner;

public class D3C2Fibonacci {

	public static void main(String[] args) {

		
		//Declare Variable
		int n;
		int pno=0;
		int cno=1;

        //Instantiate Scanner Class
		Scanner sc= new Scanner(System.in);
		
		//Read the number from user
		System.out.println("Enter a number:");
		n=sc.nextInt();

		//Print zero and one
		System.out.print(+pno+","+cno);

		//Using while loop keep on adding previous and current number
		while(cno<n)
		{    
			int temp=cno;
			cno=pno+cno;
			pno=temp;	
			if(cno<n)
			{
				System.out.print(","+cno);    
			}

		}    

		//Close the scanner object
		sc.close();	

	}

}
