package setsizeAndpositin;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) 
	{

	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.naukri.com/");
	
	System.out.println(driver.manage().window().getPosition());
	//10,10
	
	//1.Create and object of point class ,and pass x & y values
	
	Point p=new Point(150, 200);
	
	//2.by using setPosition method we can set browser position
	driver.manage().window().setPosition(p);
		
		
	}

}
