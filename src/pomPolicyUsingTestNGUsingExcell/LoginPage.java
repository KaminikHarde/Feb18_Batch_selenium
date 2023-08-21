package pomPolicyUsingTestNGUsingExcell;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

	
	//variable
	@FindBy(xpath ="//a[text()='Sign in']" )private  WebElement SignInButtonHomePage;
	@FindBy(xpath = "(//input[@type='number'])[2]")private WebElement mobileNumberField;
	@FindBy(xpath =" (//span[text()='Sign in with Password'])[2]")private WebElement SignInWithPassword;
	@FindBy(name = "password")private WebElement passwordField;
	@FindBy(xpath = "//span[text()='Sign in']")private WebElement signInButton;
	@FindBy(xpath = "//div[text()='My Account']")private WebElement MyAccountButton;
	@FindBy(xpath = "//span[text()=' My profile ']")private WebElement myProfileButton;
	//constructor
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Methods
	public void ClickOnSignInButtonHomePage() 
	{
		SignInButtonHomePage.click();
	}
	
	public void enterMobileNum(String mobNum) 
	{
		mobileNumberField.sendKeys(mobNum);
	}
	
	public void clickOnSignInWithPassword() 
	{
		SignInWithPassword.click();
		
	}
	public void enterPassword(String pwd) 
	{
		passwordField.sendKeys(pwd);
	}
	public void clickOnSignInButton()
	{
		signInButton.click();
		}
	
	public void clickOnMyAccountButton() 
	{
		MyAccountButton.click();
	}
	public void clickOnMyProfileButton()
	{
		myProfileButton.click();
	}
	}

