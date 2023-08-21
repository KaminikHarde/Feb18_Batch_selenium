package testNgAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
	 @Test(timeOut = 1000)
  public void login() throws InterruptedException  
  
  {
	  
	 Thread.sleep(3000); 
	 
	 Reporter.log("Login Working....",true);
  }
}
