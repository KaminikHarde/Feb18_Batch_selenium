package dataprovidersUse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateAccount {
  @Test(dataProvider = "myFBdata",dataProviderClass = DataProviderTest.class)
  public void fbAccount(String firstName,String lastName,String mobNum) throws InterruptedException 
  
  {
	  
	  
	 WebDriver driver=new ChromeDriver(); 
	  
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.facebook.com/campaign/landing.php?campaign");
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 driver.findElement(By.name("firstname")).sendKeys(firstName);
	 
	 Thread.sleep(1000);
	 driver.findElement(By.name("lastname")).sendKeys(lastName);
	 
	 Thread.sleep(1000);
	 
	 driver.findElement(By.name("reg_email__")).sendKeys(mobNum);
	 
  }
}
