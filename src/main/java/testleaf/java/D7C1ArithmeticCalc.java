//@author- Biswajit Sundara
//@Date- 05/09/2018
//@Program - Java program to perform arithmetic operation
//@Day-7
//@Code-1
//@Satus-Complete

/*
  1. To get 3 user inputs
     - Two numbers
     -One string which can be either 
      'add','subtract','Multiply',Divide   
      
  2. Perform the equivalent arithmetic operation
*/



package testleaf.java;

import java.util.Scanner;

public class D7C1ArithmeticCalc {

	public static void main(String[] args) {

		//Declare Variable
		int num1,num2;
		int result = 0;
		String op;
		
		//Instantiate the scanner class
		Scanner sc=new Scanner(System.in);
		
		
		//Read the numbers from user
		System.out.println("Enter number1= ");
		num1= sc.nextInt();
		
		System.out.println("Enter number2= ");
		num2= sc.nextInt();
		
		
		//Read the operation to be done on the numbers
		System.out.println("Enter The Operation= ");
		op= sc.next();

		//Using switch case go to the corresponding case
		switch(op)
		{
		case "add":  result=num1+num2;break;
		case "sub":  result=num1-num2;break;
		case "mult": result=num1*num2;break;
		case "div": result=num1/num2;break;
		default: System.out.println("Enter correct operation code");
		}
		
		
		//Print the result
		System.out.println("The "+op+" result="+result);
		
		
		//Close the scanner object
		sc.close();
	}

}
