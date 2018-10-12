package codes.numbers;

import org.testng.annotations.Test;

public class DuplicateNumber {
	
	@Test
	public void methodone()
	{
		int arr[]= {1,3,3,7,8,8,9};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
	}

}
