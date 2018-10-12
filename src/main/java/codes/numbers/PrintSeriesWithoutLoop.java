//@author - Biswajit Sundara
//@date - 10/12/2018
//@code - How will you print 0 to 100 without using loop


package codes.numbers;

public class PrintSeriesWithoutLoop {

	public static void main(String[] args) {

		printNos(100); 

	}

	static void printNos(int n) 
	{ 
		if(n > 0) 
		{ 
			printNos(n - 1); 
			System.out.print(n + " "); 
		} 
		return; 
	} 
}
