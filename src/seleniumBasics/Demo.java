package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement facebooklogin=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		facebooklogin.sendKeys("kaminiharde02@gmail.com");
		WebElement facebookpassword=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		facebookpassword.sendKeys("Kamini@1234");
		WebElement facebooksignup=driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
		facebooksignup.click();
		
	
		
	}
}
