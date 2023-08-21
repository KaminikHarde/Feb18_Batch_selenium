package pomPolicy;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethod.CommonMethod;

public class TestUserName {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		CommonMethod.implicitwait(driver, 1000);
		
		//create object of login page
		
		LoginPage login=new LoginPage(driver);
		 login.ClickOnSignInButtonHomePage();
		 Thread.sleep(1000);
		 login.enterMobileNum();
		 Thread.sleep(1000);
		 login.clickOnSignInWithPassword();
		 Thread.sleep(1000);
		 login.enterPassword();
		 Thread.sleep(1000);
		 login.clickOnSignInButton();
		 Thread.sleep(1000);
		 login.clickOnMyAccountButton();
		 Thread.sleep(1000);
		 login.clickOnMyProfileButton();
		 Thread.sleep(1000);
		 
		 //new tab will be opened , we need to switch new tab
		Set<String> allID = driver.getWindowHandles();
		List<String>al=new ArrayList<>(allID);
	 
		//switching focus to my account page
		driver.switchTo().window(al.get(1));
		
		//create object of myAccountpage class
		Thread.sleep(1000);
		MyAccountPage myAcc=new MyAccountPage(driver);
		myAcc.ValidateUserName();
		
		driver.quit();
		
	}

}
