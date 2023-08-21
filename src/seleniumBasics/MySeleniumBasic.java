package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MySeleniumBasic {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.naukri.com/");
		System.out.println("Title of the webpage is:"+driver.getTitle());
		
		System.out .println("current URL of the webpage is:"+driver.getCurrentUrl());
		System.out .println("Pagesource of the webpage is:"+driver.getPageSource());
		
		
		//Find element 
		// isDisplayed()  &  IsEnabled()
		WebElement name=driver.findElement(By.xpath("//*[@id=\"trending-naukri-wdgt\"]/div/div[3]/a[1]/span"));
		System.out.println("Display stastus is"+name.isDisplayed());
		System.out.println("Enable stastus is"+name.isEnabled());
		
		
		
		
		
		
	}

}
