//@author- Biswajit Sundara
//@Date- 05/08/2018
//@Program - Select country drop down from IRCTC website
//@Day-6
//@Code-1
//@Satus-Complete

/*
  How to select country drop down value from IRCTC website that starts
  with E but the second match (Select Egypt but not Ecuador)  

 */



package testleaf.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class D1C1DropDown {

	public static void main(String[] args) {


		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//open the website
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();

		


	}
	
}	

	
