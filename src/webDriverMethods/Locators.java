package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		//1.locators-->Name
		driver.findElement(By.name("email")).sendKeys("Good Morning");
		
		driver.findElement(By.name("pass")).sendKeys("Bye");
		
		//2.Locator-->ID
		
		//driver.findElement(By.id("email")).sendKeys(" Hello");
		
		//3.-->class
		//make sure there is no space in classname
		//if there is space in classname use only the value where there is no space
		driver.findElement(By.className("inputtext")).sendKeys(" Hello");
		
		
		

	}
	

}
