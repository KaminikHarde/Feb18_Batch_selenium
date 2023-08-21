package testNGstudy;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest1 {
 @BeforeMethod
 
 public void loginToPolicyBazar()
 
 {
	 System.out.println("Login to application");
 }
 

	  @Test
	  
	  public void validateUserName() 
	  {
		  
		  System.out.println("validateUserName");
	  }
	  
	  @AfterMethod
	  
	  public void logoutFromApplication()
	  {
		  System.out.println("logging out---");
	  }
	  
	  @Test
	  
	  public void validateGender()
	  {
		  
		  System.out.println("ValidateGender");
	  }
	  
	  @BeforeClass
	  
	  public void closeBrowser()
	  {
		  System.out.println("close Browser");
	  }
	  
  }

  
  
  
  

