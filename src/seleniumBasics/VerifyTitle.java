package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String ExpectedTitle="jobs-Recruitment-job search-Employment-job vacancies-naukari.com";
		String actualTitle=driver.getTitle();
		System.out.println("expected value"+ExpectedTitle);
		
		System.out.println("actual value"+actualTitle);
		if(ExpectedTitle.equals(actualTitle));
		{
			System.out.println("Expected and Actual Title are matching & TC is passed");
		}
	
		{
			System.out.println("Expected and actual Title are not matching & TCis fail");
		}
		
		
		
	}
	}