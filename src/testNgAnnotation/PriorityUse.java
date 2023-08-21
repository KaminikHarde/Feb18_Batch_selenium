package testNgAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
  @Test(priority = -2)
  public void b() 
  
  {
	Reporter.log("Method b is running",true);  
  }
  
  @Test(priority = -3)
  public void d() 
  
  {
	Reporter.log("Method d is running",true);  
  }
  
  @Test
  public void a()
  
  {
	  Reporter.log("Method a is running",true);
	  		
  }
  @Test(priority = -1)
  public void c() 
  
  {
	Reporter.log("Method c is running",true);  
  }
  
}
