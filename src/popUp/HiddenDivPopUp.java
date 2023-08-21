package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		   
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);		
		//here pop up will appear
		//before taking any action we need to handle popup first
		
	  driver.findElement(By.xpath("//button[text()='✕']")).click();
        
		driver.findElement(By.name("q")).sendKeys("I Phone 14");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        
		
		
		
	}

}
