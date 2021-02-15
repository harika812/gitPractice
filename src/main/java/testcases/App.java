package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testsuitebase.SuiteBaseClass;

/**
 * Hello world!
 */

public class App extends SuiteBaseClass
{
	public String url="https://www.seleniumeasy.com/test/";
	@BeforeTest
	public void beforeTest()
	{
		 
		launch(getDriver(),url);
		
	}
	@Test
	public void method1()
    {
		try {
			HP.testMethod1(getDriver());
			takescreenshot(getDriver());
		}
		catch(Exception e)
		{
			
		}
}
}

