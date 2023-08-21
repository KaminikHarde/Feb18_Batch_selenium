package setsizeAndpositin;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");		
			
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		
		Dimension d = driver.manage().window().getSize();
		
		//default size 1382,744
				//1.create an object of Dimension class and pass two parameters
				//1st width and 2nd height
		Dimension d1=new Dimension(500, 400);

		
		//2 By using setSize method we can set broser size
		driver.manage().window().setSize(d1);
		
		
		
		
	}

}
