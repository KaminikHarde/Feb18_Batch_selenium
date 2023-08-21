package pomPolicyUsingTestNGUsingExcell;


import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonMethod.CommonMethod;



public class ValidatePolicyUserName {
	
	WebDriver driver;
	LoginPage login;
	
	MyAccountPage myacc;
	
	@BeforeClass
	public void launchPolicyBazzar()
	{
		driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		login=new LoginPage(driver);
		myacc=new MyAccountPage(driver);
	}
	 
	
	
	@BeforeMethod
	public void loginToPolicyBazzar() throws EncryptedDocumentException, IOException
	{
		CommonMethod.implicitwait(driver, 1000);
		login.ClickOnSignInButtonHomePage();
		CommonMethod.implicitwait(driver, 1000);
		login.enterMobileNum(CommonMethod.readDataFromExcell(0, 0));
		CommonMethod.implicitwait(driver, 1000);
		login.clickOnSignInWithPassword();
		CommonMethod.implicitwait(driver, 1000);
		login.enterPassword(CommonMethod.readDataFromExcell(0, 1));
		CommonMethod.implicitwait(driver, 1000);
		login.clickOnSignInButton();
		CommonMethod.implicitwait(driver, 1000);
		login.clickOnMyAccountButton();
		CommonMethod.implicitwait(driver, 1000);
		login.clickOnMyProfileButton();
		CommonMethod.implicitwait(driver, 1000);
		Set<String> allWindowID = driver.getWindowHandles();
		List<String>id=new ArrayList<>(allWindowID);
		//switching focus to child page
		
		driver.switchTo().window(id.get(1));
		CommonMethod.implicitwait(driver, 1000);
	}
	
	
  @Test
  public void VerifyUserName() throws EncryptedDocumentException, IOException
  {
	String expUN=CommonMethod.readDataFromExcell(0, 2) ;
	String actualUN = myacc.getActualUserName();
	Assert.assertEquals(actualUN,expUN ,"TC failed ,actual and expected UN not maching");
  }
  
  @AfterMethod
  public void logoutFromPolicyBazzar() 
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  myacc.clickOnLogOutButton();
	  
  }
  
  @AfterMethod
  public void closeBrowser()
  {
	  driver.quit();
  }
}
