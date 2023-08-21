package testNgAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledUse {
  @Test
  public void b() 
  
	  
	  {
		Reporter.log("Method b is running",true);  
	  }
  
  
  @Test
  public void d() 
  
	  
	  {
		Reporter.log("Method d is running",true);  
	  }
	  
	  @Test(enabled = false)
	  public void a() 
	  
		  
		  {
			Reporter.log("Method a is running",true);  
		  }
	  @Test
	  public void c() 
	  
		  
		  {
			Reporter.log("Method c is running",true);  
		  }
	  
}
