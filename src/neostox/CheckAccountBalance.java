package neostox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAccountBalance {

	public static void main(String[] args)
	{
		
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://www.neostox.com/");
    
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
   //clicking on sign inbutton
    
    driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    
    //entering mobile no
    driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("8459999514");
    
    //click on sign in button
    driver.findElement(By.id("lnk_signup1")).click();
   // launching password page
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    driver.findElement(By.id("txt_accesspin")).sendKeys("8459");
    
    //click on submit button
    driver.findElement(By.id("lnk_submitaccesspin")).click();
    
    //launching Homepage
    
    
    
	}

}
