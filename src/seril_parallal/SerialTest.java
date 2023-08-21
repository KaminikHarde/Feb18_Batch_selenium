package seril_parallal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SerialTest {
  @Test
  public void Insta()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.instagram.com/");
  }
}
