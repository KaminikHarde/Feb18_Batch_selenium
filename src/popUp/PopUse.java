package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUse {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("alertButton")).click();
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(1000);
		//alt.accept();
		alt.dismiss();
	
		
		
		
		
		
	}

}
