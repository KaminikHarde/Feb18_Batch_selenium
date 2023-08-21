package testNgAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeywordsUse {
  @Test(enabled=false)
  public void a() 
  {
	  
	Reporter.log("a is running...",true);  
  }
  
  @Test(priority=-10)
  
  public void b() 
  {
	  
	Reporter.log("b is running...",true);  
  }
  

  @Test(dependsOnMethods = {"a","c"},priority=-9 )
   
  public void c() 
  {
	  Reporter.log("c is running....",true);
  }
  
 
}
