//@author- Biswajit Sundara 
//@date- 10/09/2018
//@code - Write a Java code to arrange words in alphabetical order.

package codes.strings;

import java.util.Arrays;


public class WordsFromSentence {

	public static void main(String[] args) {
		
		String sentence = "Hello My Friend How Are You?";
		
		String words[] = sentence.split("\\s");
		
		Arrays.sort(words);
		
		StringBuilder sb= new StringBuilder();
		
		for (String wd: words)
		{
			sb.append(wd);
			sb.append(" ");
		}

		System.out.println("The new sentence= " +sb);
	}

}
