//@author- Biswajit Sundara
//@Date- 05/03/2018
//@Program - Java program to get a number in the console and print its factorial
//@Day-3
//@Code-1
//@Status-Complete

/*
    Sample Input: Enter number= 4

    Sample Output: Factorial of 4: 4*3*2*1= 24            
 */



package testleaf.java;

import java.util.Scanner;

public class D3C1Factorial {

	public static void main(String[] args) {

		//Declare variable
		int number;
		int fact=1;
		
		//Instantiate Scanner Class
        Scanner sc= new Scanner(System.in);
        
        //Read input from the user
        System.out.println("Enter a number:");
        number=sc.nextInt();
        
        
        //Using for loop determine the for loop
        System.out.print("Factorial of "+number+": ");
        for(int i=number; i>=1;i--)
        {
        	
        	fact=fact*i;
        	System.out.print(+i);
        	if(i>1)
        	{
        		System.out.print("*");
        	}
        	
        }
		
        //Print the factorial
        System.out.println("="+fact);
        
        //Close the scanner object
        sc.close();
	}

}
