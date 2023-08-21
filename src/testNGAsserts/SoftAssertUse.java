package testNGAsserts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void UserNamePage() 
  {
	  String actualUN="ABC";
	  
	  String expUN="ABC";
	  
	  SoftAssert s=new SoftAssert();
	  
	  s.assertNotNull(actualUN, "UN is null,Tc is failed");
	  
	  s.assertEquals(actualUN,expUN ,"Actual and expected are not matching TC is failed");
	  
	  s.assertAll();
  }
}
