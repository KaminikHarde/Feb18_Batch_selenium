package commonMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PolicyBazaar {

	public static void main(String[] args) throws InterruptedException 
	{

	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("disable-notifications");
	
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.policybazaar.com/");
		
		driver.manage().window().maximize();
		
	
	CommonMethod.implicitwait(driver,1000);
	
	//click on sign in button
	
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	
	Thread.sleep(1000);
		
		//enter mobile number
	driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9552439884");
	 // Thread.sleep(1000);
	
     //	click on sign in with password button
	
	//click on sign in with password
	  driver.findElement(By.xpath("//span[text()='Sign in with Password']")).click();
	
	  Thread.sleep(1000);

	//enter password
	  
	  driver.findElement(By.name("password")).sendKeys("Ashu@1234");
	  
	  //click on sign in button
	  driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	  
	  CommonMethod.implicitwait(driver, 1000);
	  
	  //now we are on home page
	  
	  //move to my account
	  
	  driver.findElement(By.xpath("//div[text()='My Account']")).click();
	  
	  Thread.sleep(1000);
	  //click on my profile
	  
	  driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
	  
	  
	  
	}

}
