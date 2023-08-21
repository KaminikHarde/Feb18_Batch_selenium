package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://discoveryplus.in/");
		Thread.sleep(2000);
		WebElement signInButton=driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		signInButton.click();
		
		
		
	}

}
