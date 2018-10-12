//@author-Biswajit Sundara
//@date- 10/05/2018
//@code- sum of digits

package codes.numbers;

import org.testng.annotations.Test;

public class SumOfDigits {

	int number=532;

	//@Test
	public void methodone()
	{
		int sum=0;
		while(number!=0)
		{
			int rem= number%10;
			number=number/10;
			sum=sum+rem;
		}
		System.out.println("Sum of digits=" +sum);
	}

	//We can use another approach using recursion	

	@Test	
	public void methodtwo()
	{
		int result= sumdigit(number);
		System.out.println("sum of digits=" +result);
	}

	public int sumdigit(int number)
	{
		if(number==0)
			return 0;

		else
			return(number%10+sumdigit(number/10));

	}

}
