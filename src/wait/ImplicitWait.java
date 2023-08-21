package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) 
	{
 
		WebDriver driver=new ChromeDriver();
		driver.get("https://discoveryplus.in/");
		//implicit wait
		//Applicable:complete wabepage
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		//80--ms-->920 ms release
		
		WebElement signInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		signInButton.click();
		
	}

}
