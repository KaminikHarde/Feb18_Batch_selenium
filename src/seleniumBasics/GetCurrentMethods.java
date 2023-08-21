package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentMethods {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();
	String myurl = driver.getCurrentUrl();
	System.out.println("My Url is"+myurl);
	System.out.println(driver.getPageSource());
		
		
	}

}
