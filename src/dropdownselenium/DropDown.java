package dropdownselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//clicking on create new account
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		
	//next page will be page-->give some time to load page
		Thread.sleep(5000);
		//1.Identify list box to be handled and store it in reference variable 
		WebElement day=driver.findElement(By.id("day"));
		//2.create an object of select class which will accept WebElement as argument 
		Select sdate=new Select(day);
		
		//3.By using one of select class methods we can select values from list box like 
		
		//1.select by visible text
		//select date 10
		
       //sdate.deselectByVisibleText("10");
		
		//2.select by index
		//sdate.selectByIndex(9);
		
		//3.select by value
		sdate.selectByValue("10");
		
		//selecting month
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select smonth=new Select (month);
		smonth.selectByValue("9");
		
		//selecting year
		WebElement year = driver.findElement(By.id("year"));
		Select syear=new Select(year);
		syear.selectByVisibleText("2010");
		//check if any drop down is multiple selectable or not 
	    System.out .println("is multiple status is"+syear.isMultiple());
		
		
	}
 
	
	}


