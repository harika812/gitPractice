package testsuitebase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumBase {
	
	public void click(WebDriver driver,By by)
	{
		WebElement element=null;
		try
		{
			element=driver.findElement(by);
			Thread.sleep(2000);
			JavascriptExecutor executor1=(JavascriptExecutor) driver;
			executor1.executeScript("arguments[0].click();", element);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
