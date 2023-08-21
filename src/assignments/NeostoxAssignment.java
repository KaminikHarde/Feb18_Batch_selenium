package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeostoxAssignment {

	public static void main(String[] args) throws InterruptedException 
	{

	WebDriver driver=new ChromeDriver();	
		
	driver.get("https://www.neostox.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.xpath("//a[text()='Sign In'][1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number'][1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type()='number'][1]")).sendKeys("9552439884");
		
		Thread.sleep(1000);
		driver.findElement(By.id("//a[@id='lnk_signup1']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("6316");
		
		driver.findElement(By.linkText("Submit")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		Thread.sleep(1000);
		
		
		
	}

}
