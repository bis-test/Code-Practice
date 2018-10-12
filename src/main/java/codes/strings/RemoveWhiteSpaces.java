package codes.strings;

import org.junit.Test;

public class RemoveWhiteSpaces {

	@Test
	public void methodone()
	{
		//1st method
		// using built in method

		String str = "India     Is My    Country";  
		String noSpaceStr = str.replaceAll("\\s", "");   
		System.out.println(noSpaceStr);  
	}

	
	@Test
	public void methodtwo()
	{
		//2nd method
		//Reading character by character
		
		String str = "India     Is My    Country";
		char[] strArray = str.toCharArray();  
		StringBuffer stringBuffer = new StringBuffer();  
		
		for (int i = 0; i < strArray.length; i++) 
		{  
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
				stringBuffer.append(strArray[i]);  
			}  
		}  
		String noSpaceStr = stringBuffer.toString();  
		System.out.println(noSpaceStr);  
	}
	

}
