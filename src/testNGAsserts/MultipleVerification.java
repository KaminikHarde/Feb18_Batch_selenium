package testNGAsserts;

import static org.testng.Assert.assertNotNull;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification {
  @Test (priority = -1)
  public void UserNamePage() 
  {
	  
	  String actualUN=null;
	  
	  String expUN="ABC";
	  
	  Assert.assertNotNull(actualUN, "value is null ,TC is failed");
	  
	  Assert.assertEquals(actualUN,expUN ,"actual and expected are not matching,TC failed");
	  
  }
	  
	  @Test
	  public void PasswordPage() 
	  {
		 
		String actualPass="123";
		
		String expPass="123";
		
		Assert.assertNotNull(actualPass, "password is null ,TC is failed");
		
		Assert.assertEquals(actualPass,expPass ,"actual and expected are not matching,TC is failed");
		  
	  }
  }

