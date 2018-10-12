//@author-Biswajit Sundara
//@date- 10/12/2018
//@code - Print only unique values from the array
//@code - Refer the method three, we are printing unique and sorted


package codes.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.junit.Test;

public class UniqueStringList {
	
	@Test
	public void methodone()
	{
		String[] array = {"def", "abc", "hellow", "hey","def", "abc"};
	    Set<String> set = new HashSet<>();

		Collections.addAll(set, array);
		System.out.println("Unique using approach one");
		System.out.println(set);
	}
	
	
	@Test
	public void methodtwo()
	{
		String[] array = {"abcd", "def", "abc", "hellow", "hey","def"};
		Set<Object> strSet1 = Arrays.stream(array).collect(Collectors.toSet());
		System.out.println("Unique using approach two");
		System.out.println(strSet1);
	}
	
	
	@Test
	public void methodthree()
	{
		String[] array = {"def", "abc", "hellow", "hey","def", "abc"};
	    Set<String> set = new TreeSet<>();

		Collections.addAll(set, array);
		System.out.println("Unique and Ascending");
		System.out.println(set);
	}


}
