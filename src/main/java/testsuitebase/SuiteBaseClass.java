package testsuitebase;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import pagemethods.HomePage;

public class SuiteBaseClass {
	public HomePage HP=new HomePage();
	
	//WebDriver driver;
	InheritableThreadLocal<WebDriver> driver=new InheritableThreadLocal<WebDriver>();
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Work practice\\Eclipse\\chromedriver.exe");
	}
	public WebDriver getDriver()
	{
		return driver.get();
	}
	
	public void launch(WebDriver driver,String url)
	{
		driver.get(url);
        driver.manage().window().maximize();

	}
	public void takescreenshot(WebDriver driver)
	{
		/*
		 * TakesScreenshot ts=(TakesScreenshot)driver; File
		 * srcFile=ts.getScreenshotAs(OutputType.FILE);
		 */
		try {
			Date d=new Date();
			String dateFormat=d.toString();
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destFile=new File(".\\screenshots\\"+dateFormat+"_samplescreenshot");
			FileUtils.copyFile(srcFile, destFile);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
