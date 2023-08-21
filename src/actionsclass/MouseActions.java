package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException
	{

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	//steps to take actions using actions class (MouseActions)
	
	//1.create an object of actions class and pass driver object
	
	Actions act=new Actions(driver);
	//2.by using action class,we can click
	
	WebElement seleniumButton = driver.findElement(By.xpath(" (//a[contains(text(),'Selenium')])[1]"));
	
	//hot to click using actions class
	
	//seleniumButton.click();-->by using webElementmethod
	Thread.sleep(1000);
	 act.click(seleniumButton).perform();
	
		
	}

}
