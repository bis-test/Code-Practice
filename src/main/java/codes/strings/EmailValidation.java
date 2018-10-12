//@author- Biswajit Sundara
//@date- 10/12/2018
//@code - Write a program to validate if the email address format is valid


package codes.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		String email="abc@gmail.com";
		String patt="[a-z]{3}\\W[a-z]{5}\\W[a-z]{3}";
		
		Pattern p=Pattern.compile(patt);
		Matcher m=p.matcher(email);
		
		System.out.println(m.matches());

	}

}
