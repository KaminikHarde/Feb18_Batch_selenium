package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitlemethod {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phonepe.com/");
		driver.manage().window();
	String mytitle = driver.getTitle();
	System.out.println("Title of page is"+mytitle);
		
	}

}
