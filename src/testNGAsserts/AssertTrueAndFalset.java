package testNGAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueAndFalset {
  @Test
  public void a() 
  {
	  Boolean x=true;
	  Boolean y=false;
	
	//  Assert.assertTrue(x,"value is false TC is failed");
	
	 Assert.assertFalse(x, "value is true TC is failed");
  }
  
}
