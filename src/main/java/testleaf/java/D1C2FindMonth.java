//@author- Biswajit Sundara
//@Date- 05/01/2018
//@Program - Simple java program to determine the month based on the given number and 
//           find the number of days in that month
//@Day-1
//@Code-2
//@Status-Complete

/*
    Sample Input: Enter a number=5

    Sample Output: The 5th month of the year is May
                   Number of days in the month of May is 31                 
 */


package testleaf.java;

import java.time.Month;
import java.util.Scanner;

public class D1C2FindMonth {

	public static void main(String[] args) {

		//Declare variable
		int month;
		String MonthDesc;
		int days;


		//Read user input
		System.out.println("Enter the month number");
		Scanner sc= new Scanner(System.in);
		month=sc.nextInt();

		//Using switch to navigate to the month 
		switch(month)
		{
		case 1: System.out.println("Entered Month is Jan"); 
				MonthDesc="Jan"; 
				break;
		case 2: System.out.println("Entered Month is Feb"); 
				MonthDesc="Feb"; 
				break;
		case 3: System.out.println("Entered Month is March");
				MonthDesc="March"; 
				break;
		case 4: System.out.println("Entered Month is April");
				MonthDesc="April"; 
				break;
		case 5: System.out.println("Entered Month is May");
				MonthDesc="May"; 
				break;
		case 6: System.out.println("Entered Month is June");
				MonthDesc="June"; 
				break;
		case 7: System.out.println("Entered Month is July");
				MonthDesc="July"; 
				break;
		case 8: System.out.println("Entered Month is August");
				MonthDesc="August"; 
				break;
		case 9: System.out.println("Entered Month is September");
				MonthDesc="September"; 
				break;
		case 10: System.out.println("Entered Month is October");
				MonthDesc="October"; 
				break;
		case 11: System.out.println("Entered Month is November");
				MonthDesc="November"; 
				break;
		case 12: System.out.println("Entered Month is December");
				MonthDesc="December"; 
				break;
		default: System.out.println("Invalid Month Selection");
				 MonthDesc="None";
		         break;
		}

		//Find the days in the month
		days=Month.of(month).length(false);
		System.out.println("Number of days in the month of " + MonthDesc +" is "+ days);

		//Close the scanner object
		sc.close(); 

	}

}
