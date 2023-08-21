package neostox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonMethod.CommonMethod;

public class ValidatePolicyBazarUserName {

	public static void main(String[] args) throws InterruptedException 
	{
	
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
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9552439884");
		 
		//click on sign in with password
		
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		Thread.sleep(1000);
		
		//enter password
		
		driver.findElement(By.name("password")).sendKeys("Ashu@1234");
		
		//click on signInButton
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		CommonMethod.implicitwait(driver, 900);
		
		//now we are on home page
		//move on my Account
		
		driver.findElement(By.xpath("//div[text()='My Account']")).click();
		
		Thread.sleep(1000);
		
		//click on my profile
		
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		
		
		
		
	}

}
