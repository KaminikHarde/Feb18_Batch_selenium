package dropdownselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionDropDown {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();

	//clicking on create new account
		driver.manage().window().maximize();	
		driver.get("http://www.uitestpractice.com/students/select");
		Thread.sleep(1000);
		 WebElement countries = driver.findElement(By.id("countriesMultiple"));
		Select s=new Select(countries);//if drop down is multiple selectable or not
		System.out.println("Multiple selectable status is "+s.isMultiple()) ;
		s.selectByIndex(0);//selecting india
		s.selectByValue("england");//selecting england
		s.selectByVisibleText("China");//Selecting china
		//hot to deselect ?--> multiple selecatable
		Thread.sleep(1000);
		//s.deselectByVisibleText("China");
		s.deselectAll();
	  //System.out.println(s.getAllSelectedOptions());
		List<WebElement> allElements = s.getAllSelectedOptions();
		 for(WebElement a:allElements) 
		 {
			 System.out.println(a.getText());
		 }
		
		
		
		 
		
	}

}
