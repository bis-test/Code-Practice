//@author - Biswajit Sundara
//@date- 10/05/2018
//@code - Java program to ReverseString



package codes.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class ReverseString {

	String str="I am doing good";

	//@Test
	public void methodone()
	{
		//Using built in reverse() method of the StringBuilder class
		StringBuilder  sbr = new StringBuilder();
		sbr.append(str);
		sbr = sbr.reverse();
		System.out.println("The reversed string =" +sbr);
	}


	//@Test
	public void methodtwo()
	{
	   //convert String to character array
	   //Print character from the last position	
       char[] cstr = str.toCharArray();
       int len= cstr.length;
       for (int i=len-1;i>=0;i--)
    	   System.out.print(cstr[i]);
	}
	
	
	@Test
	public void methodthree()
	{
		char[] cstr = str.toCharArray();
		List<Character> arlst= new ArrayList<>();
		for(char c:cstr)
		arlst.add(c);
		
		Collections.reverse(arlst);
		
		ListIterator li = arlst.listIterator();
		while (li.hasNext())
		System.out.print(li.next());
	}
	

}
