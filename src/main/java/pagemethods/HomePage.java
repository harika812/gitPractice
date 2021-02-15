package pagemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public void selectPage(WebDriver driver,String PageName)
	{
		try
		{
			if(PageName.equals("Simple Form Demo"))
			{
			 System.out.println( "Hello World!, In test class. Started execution" );	
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void testMethod1(WebDriver driver)
    {
		try {
        System.out.println( "Hello World!, In test class. Started execution" );
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='No, thanks!']"));
		}
		catch(Exception e)
		{
			
		}
}

}
