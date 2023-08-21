package popUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUpUse {

	public static void main(String[] args) throws InterruptedException 
	{
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://skpatro.github.io/demo/links/");
     Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();  //will open new child window
		//we want to work on new/child window
		//we need to switch selenium focus from main page to child browser
		//to switch to new window-->we should now windowID
		
		Set<String>allWindowIDS=driver.getWindowHandles();// we will collect all windows ID
		
		//we are converting set object to array list
		ArrayList<String>al=new ArrayList<>(allWindowIDS);
		
		String mainpageID=al.get(0);    //ID of main page
		String childWindowID=al.get(1);   //ID of child window
		//switch selenium focus from main page to child window
		driver.switchTo().window(childWindowID);//now seleniun focus to child window
		driver.manage().window().maximize();
		// performing action on child window
		driver.findElement(By.id("the7-search")).sendKeys("Good Morning");
		//again we want to work on main page
		//close child page
		//change focus from child page to main page
		//perform your action
		driver.close();
		driver.switchTo().window(mainpageID);
		String mainpageText=driver.findElement(By.tagName("b")).getText();
		System.out.println("text is"+mainpageText);
		
		
		
		
		
		
		
		
	}

}
