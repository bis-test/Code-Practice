//@author- Biswajit Sundara
//@Date- 05/04/2018
//@Program - Java program to find first and third largest number in an array
//@Day-4
//@Code-1
//@Status-Complete

/*
    Sample Input: Enter the numbers= 13,25,9,56,54,89,17

    Sample Output: The first largest number is 89
                   The third largest number is 54      
 */


package testleaf.java;

import java.util.Arrays;

public class D4C1FirstAndThirdLargestNumber {

	public static void main(String[] args) {
		
		
		//Using the sorting method.
		int a[]={13,67,88,65,13,95,67,65,87,95,19,29};
		Arrays.sort(a);
		int flargest=a[a.length-1];
		System.out.println("The first largest number is "+flargest);
		int tlargest=a[a.length-3];
		System.out.println("The third largest number is "+tlargest);
		
		
		//Not using the sorting method
		int[] intArray = {20, 340, 21, 879, 92, 21,474,83647,-200};
		int temp;
		int n=intArray.length;
		for(int i=0;i<n;i++)
		{
	
			for(int j=1;j<(n-i);j++)
			{
				if(intArray[j-1] > intArray[j])
				{
					temp=intArray[j-1];
					intArray[j-1]=intArray[j];
					intArray[j]=temp;
				}
			}
		}
		
		int flargest1=intArray[intArray.length-1];
		System.out.println("The first largest number is "+flargest1);
		int tlargest1=intArray[intArray.length-3];
		System.out.println("The third largest number is "+tlargest1);
	}

}
