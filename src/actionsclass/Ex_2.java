package actionsclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_2 {

	
	
	public static void main(String[] args) throws InterruptedException
	{

		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bstackdemo.com/");
		
		
		 driver.findElement(By.xpath("//select")).click();
		List<WebElement> alloption = driver.findElements(By.cssSelector("select option "));
		
		String option="Highest to lowest";
		//Iterating the list using for loop
		
		List<WebElement> alloptions = null;

		for(int i=0;i< alloptions.size();i++)
		{
			
			
			alloptions.get(i).click();
			System.out.println("clicked");
			break;
		}
		
	}
}
