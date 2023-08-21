package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAssignment {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/");
		Thread.sleep(1000);
		//1.by using class 
		WebElement button = driver.findElement(By.id("btn2"));
	   button.click();
	   
	   //2.by using action class
	   
	   Actions as=new Actions(driver);
	   
	   
	   as.click(button).perform();
	   
	   //3. by using action javascript executor
	   
	   Thread.sleep(1000);
	   
	   JavascriptExecutor js=((JavascriptExecutor)driver);
	   
	  js.executeScript("argument[0].click()",button);
	  
	   
	   
	   
	   
	  
	}

}

