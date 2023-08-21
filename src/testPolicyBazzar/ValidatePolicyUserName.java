package testPolicyBazzar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pomPolicyUsingTestNG.LoginPage;
import pomPolicyUsingTestNG.MyAccountPage;
import utilityPolicyBazzar.Utility;

public class ValidatePolicyUserName extends Base 
{

	LoginPage login;
	MyAccountPage myacc;
	
	@BeforeClass
	
	public void launchPolicyBazzar() throws InterruptedException 
	{
		Utility.wait(1000);
		launchBrowser();
		login=new LoginPage(driver);
		myacc=new MyAccountPage(driver);
	}
	
	@BeforeMethod
	public void signInToPolicyBazzar() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Utility.wait(200);
		login.ClickOnSignInButtonHomePage();
		Utility.wait(200);
		login.enterMobileNum(Utility.readDataFromExcell(0, 0));
		Utility.wait(200);
		login.clickOnSignInWithPassword();
		Utility.wait(200);
		login.enterPassword(Utility.readDataFromExcell(0, 1));
		Utility.wait(200);
		login.clickOnSignInButton();
		Utility.wait(200);
        login.clickOnMyAccountButton();
		Utility.wait(200);
        login.clickOnMyProfileButton();
 		Utility.wait(200);
         Set<String> allpageID = driver.getWindowHandles();
          List<String>l=new ArrayList<>(allpageID);
        String mainpageID = l.get(0);
        String childpageID = l.get(1);
        driver.switchTo().window(childpageID);
        Reporter.log("switching to child page", true);
		Utility.wait(200);
		

      
	}
	
	
  @Test
  public void ValidateUserName() throws EncryptedDocumentException, IOException
  {
	String actualUN = myacc.getActualUserName();
	String expUN = Utility.readDataFromExcell(0, 2);
	   
	  Assert.assertEquals(actualUN,expUN,"TCis failed actual and expected are not matching");
	  Utility.takeScreenShot(driver, actualUN);
  }
  @AfterMethod
  public void logoutFromPolicyBazzar() 
  {
	  myacc.clickOnLogOutButton();
  }
  @AfterClass
  public void closePolicyBazzar() throws InterruptedException 
  {
		Utility.wait(1000);

	  closeBrowser();
  }
  
}
