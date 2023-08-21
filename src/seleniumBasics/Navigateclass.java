package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateclass {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();	
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().to("https://www.phonepe.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
