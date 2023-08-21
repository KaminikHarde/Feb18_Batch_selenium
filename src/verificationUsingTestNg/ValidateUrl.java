package verificationUsingTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ValidateUrl {
  @Test
  public void ValidateUrlName() 
  {
	WebDriver driver=new ChromeDriver();  
	  
	driver.get("https://noukari.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	String actualUrl = driver.getCurrentUrl();
	
	String expectedUrl="https://noukari.com/";
	 
	if(actualUrl.equals(expectedUrl)) 
	{
		
		Reporter.log("Actual & Expected url are matching TC is passed",true);
	}
	else 
	{
	Reporter.log("Actual & Expected url are not matching TC is failed",true);	
		
	}
  }
}
