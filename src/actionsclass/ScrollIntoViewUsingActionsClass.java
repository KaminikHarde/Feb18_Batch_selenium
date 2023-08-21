package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollIntoViewUsingActionsClass {

	public static void main(String[] args) 
	{

		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement amountvalue = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		 WebElement amountfield = driver.findElement(By.id("amt8"));
		
		 // create an object of actions class
		 
		 Actions act=new Actions(driver);
		 
		 act.scrollToElement(amountfield).perform();
		
		
	}

}
