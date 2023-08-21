package seleniumBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	

	public static void main(String[] args) throws InterruptedException 
	{
WebDriver driver=new ChromeDriver();	
driver.get("https://demoqa.com/");
Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Click Me']"));
		Thread.sleep(1000);
		driver.quit();
		
	}

}
