package testNgAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOn {
  @Test(dependsOnMethods="enterpassword",priority=-10)
  public void login()
  {
	  
	  
	  Reporter.log("Login Success",true);
  }
  
  @Test
  public void enterPassword()
  
  {
	  
	  //Assert.fail();
	  Reporter.log("enter Password",true);
  }
}
