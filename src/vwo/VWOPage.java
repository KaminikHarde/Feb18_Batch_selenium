package vwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethod.CommonMethod;

public class VWOPage {

	public static void main(String[] args) throws InterruptedException
	{
		
    WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://app.vwo.com/");
    
    CommonMethod.implicitwait(driver, 900);
    //click on email addresss
    
    driver.findElement(By.xpath("//input[@type='email'][1]")).sendKeys("Kaminiharde02@gmail.com");
    
    //click on sign in with password
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("(//input[@type='password'][1])")).sendKeys("Kamini@1234");
    
    Thread.sleep(1000);
    //click on sign in 
    
    driver.findElement(By.xpath("(//*[@id=\"js-login-btn\"]/span[2]"));
    
    
    
	}

}
