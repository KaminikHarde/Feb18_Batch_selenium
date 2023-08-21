package neostoxuse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonMethod.CommonMethod;

public class ValidatePolicyBazarUserNameUse {

	private static WebDriver l;

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
	// Test case with data Driven Framework
		//using chrome options for disabling notifications
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
              WebDriver driver=new ChromeDriver();
              
              driver.manage().window().maximize();
      		
		     driver.get("https://www.policybazaar.com/");
		
		CommonMethod.implicitwait(driver, 900);
		
		//clicksignIn Button
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		Thread.sleep(1000);
		
		//enter mobile number
		String userID = CommonMethod.readDataFromExcell(0, 0);
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(userID);
		 
		//click on sign in with password
		
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		Thread.sleep(1000);
		
		//enter password
		
		driver.findElement(By.name("password")).sendKeys(CommonMethod.readDataFromExcell(0, 1));
		
		//click on signInButton
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		CommonMethod.implicitwait(driver, 1000);
		
		//now we are on home page
		//move on my Account
		
		driver.findElement(By.xpath("//div[text()='My Account']")).click();
		
		Thread.sleep(2000);
		
		//click on my profile
		
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		//new window will be opened,we need to be focus to new window
		
		Set<String> allId = driver.getWindowHandles();
		
		//convert to set of list
		
		List<String>l=new ArrayList<>(allId);
		
		String mainpageID = l.get(0);//main page ID
		
		String childPageID = l.get(1);//child page ID
		
		
		//switch to child page id
		
		driver.switchTo().window(childPageID);
		
		Thread.sleep(1000);
		
		String expResult=CommonMethod.readDataFromExcell(0, 2);
		
		String actualResult = driver.findElement(By.xpath("//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']")).getText();
		
		
		if(expResult.equals(actualResult))
		{
			System.out.println("Actual and expected results are matching TC is passed");
		}
		
		else 
		{
			
			System.out.println("Actual and expected results are not-matching TC is Failed");
		}
		
		driver.close();
		
		
		
	}

}
