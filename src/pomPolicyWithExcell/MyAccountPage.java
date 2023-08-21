package pomPolicyWithExcell;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage 
{
//variable
	@FindBy(xpath ="//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']" )private WebElement userName;
	
	//constructor
	
	public MyAccountPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void ValidateUserName(String expUN) 
	
	{
		String actualUN = userName.getText();
		System.out.println("User Name--->"+actualUN);
		
		if(expUN.equals(actualUN))
				{
			      System.out.println("Actual and Expected User Name are matching TC is passed ");
				}
		else
		{
		      System.out.println("Actual and Expected User Name are not-matching TC is Failed ");
			}
	}
}
