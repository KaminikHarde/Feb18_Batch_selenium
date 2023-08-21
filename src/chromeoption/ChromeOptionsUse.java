package chromeoption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsUse {

	public static void main(String[] args) 
	{
    //1.create object of chrome option
		ChromeOptions opt=new ChromeOptions();
	//2.Using ChromeOptions object select desired options
		//opt.addArguments("headless");
		//opt.addArguments("incognito");
		//opt.addArguments("start-maximized");
		opt.addArguments("disable-infobars");
		
		
		//3.pass the object as a parameter in chrome driver
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.google.com/");
		WebElement gmailLink = driver.findElement(By.xpath("//a[text()='Gmail']"));
		System.out.println(gmailLink.getText());
		
		
	}

}
