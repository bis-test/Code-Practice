//@author- Biswajit Sundara 
//@date- 10/09/2018
//@code - Write a Java code to reverse alternate words in a sentence.
//@company - Amazon

package codes.strings;

public class WordsReverseFromSentence {

	public static void main(String[] args) {
		
		String sentence = "This is no test";
		
		String words[] = sentence.split("\\s");
		
		int counter=1;
		
		StringBuilder sb= new StringBuilder();
		StringBuilder sent= new StringBuilder();
		
		for (String wd: words)
		{
			sb.delete(0, sb.length());
			sb.append(wd);

			if(counter%2==0)
			{					
				sb.reverse();
			}	
		
			counter++;
			sent.append(sb);
			sent.append(" ");
		}

		System.out.println("The new sentence= " +sent);
	}

}
