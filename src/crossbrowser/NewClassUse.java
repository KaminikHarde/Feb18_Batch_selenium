package crossbrowser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class NewClassUse {
	@Parameters("browserName")
  @Test
  public void e(String demo) 
  
  
 
  {
	  
	  WebDriver driver = null;
	 if(demo.equals("firefox")) 
		 
		 
	 {
		 driver=	new FirefoxDriver();	
	 }
	 
	 
	 else if (demo.equals("chrome"))
	 {
		 driver=	new ChromeDriver();	
	 }
	 
	 
	 else if (demo.equals("Edge"))
	 {
		 driver=	new EdgeDriver();	
	 }
       
	    
	   	driver.get("https://policybazar.com/");
	  
	   	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	   	
	   	//
  }
  
}
