package seril_parallal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallalTestUse {
  @Test
  public void noukari() 
  {
	  
 WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://noukari.com/");
  }
}
