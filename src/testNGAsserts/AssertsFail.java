package testNGAsserts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertsFail {
  @Test
  public void f() 
  {
	  
	  Reporter.log("Good Morning All",true);
	  
	  Assert.fail();
	  
	  
  }
  
}
