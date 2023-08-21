package commonMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCommonMethods {

	public static void main(String[] args) throws IOException
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		CommonMethod.implicitwait(driver, 900);
		
		WebElement paytmInstruments = driver.findElement(By.xpath("//h1[text()='Paytm Payment Instruments']"));
		
		CommonMethod.scrollIntoView(driver, paytmInstruments);
		
    CommonMethod.captureScreenshot(driver, "MyPaytmTest1");
		
		String myValue = CommonMethod.readDataFromExcell(0, 0);
	
		System.out.println(myValue);
		
		System.out.println(CommonMethod.readDataFromExcell(0, 0));
		
	}

}
