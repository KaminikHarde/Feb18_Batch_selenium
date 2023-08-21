package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_1 {

	public static void main(String[] args) throws InterruptedException
	{
		
      WebDriver driver=new ChromeDriver();
      
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
      
      driver.get("https://demo.automationtesting.in/Index.html");
		
  
      WebElement email = driver.findElement(By.id("email"));
      WebElement submit = driver.findElement(By.id("enterimg"));
      
      //by using java script executor
      
       JavascriptExecutor js = (JavascriptExecutor)driver;
       Thread.sleep(2000);
       js.executeScript("arguments[0].value='Kaminiharde02@gmail.com'", email);
       
       
       js.executeScript("arguments[0].click()", submit);
       
       
       
      
      
      
      
    
    
		
		
		
	}

}
