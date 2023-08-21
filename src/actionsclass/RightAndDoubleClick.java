package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClick {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightclickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		WebElement doubleclickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		//create and object of Actions class and pass driver object as parameter
		
		Actions act=new Actions(driver);
		
		//by using action class object take required actions
		
		//option1 to context click
		//act.contextClick(rightclickButton).perform();
		
		//option2 to context click
	//	act.moveToElement(rightclickButton).perform();
		//act.contextClick().perform();

		//option3 to context click
		
		//act.moveToElement(rightclickButton).contextClick().build().perform();
		
		//double click button
		
		//act.doubleClick(doubleclickButton).perform();
		
		act.moveToElement(doubleclickButton).doubleClick().build().perform();
		
		
		
		
	}

}
