package tooltiphandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipUse {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/social-icon.html");
		
		WebElement element = driver.findElement(By.xpath("//a[@title='Mail'][2]"));
		
		Actions act=new Actions(driver);
		
		
		
		
		
		
		
		
		
	}

}
