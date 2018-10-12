//@author- Biswajit Sundara
//@date- 10/12/2018
//Code - Find the occurence of word in a sentence.


package codes.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.junit.Test;

public class WordOccurenceSentence {

	@Test
	public void methodone()
	{
		String str = "helloslkhellodjladfjhello";
		Pattern p = Pattern.compile("hello");
		Matcher m = p.matcher(str);
		int count = 0;
		while (m.find()){
			count +=1;
		}
		System.out.println(count); 
	}


	@Test
	public void methodtwo()
	{
		String text = "helloslkhellodjladfjhello";
		String find = "hello";
		
		int index = 0;
		int count = 0;
		int length = find.length();
		while( (index = text.indexOf(find, index)) != -1 ) 
		{                
			index = index+ length; 
			count++;
		}
		
		System.out.println("Count= " +count);
	}

}
