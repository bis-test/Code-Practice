//@author - Biswajit Sundara
//@date- 12/10/2018
//@code - Replace substring in a string

package codes.strings;

public class ReplaceSubstringString {

	public static void main(String[] args) {

		String s1="my name is khan my name is java"; 
		
		//replaces all occurrences of "is" to "was"
		String replaceString=s1.replace("is","was");  
		System.out.println(replaceString);  

	}

}
