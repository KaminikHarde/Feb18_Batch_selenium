package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeandMinimize {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phonepe.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
	}

}
