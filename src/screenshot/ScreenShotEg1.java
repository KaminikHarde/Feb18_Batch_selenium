package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEg1 {

	public static void main(String[] args) throws IOException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
     File Source = (( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\myScreenshot.png");
		FileHandler.copy(Source, dest);
     
	}

}
