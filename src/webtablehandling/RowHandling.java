package webtablehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowHandling {

	public static void main(String[] args)
	{

         WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
		
		//how to read single header data
		
WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/td[1]"));

		System.out.println(data.getText());
       
       System.out.println("=======================================");
      
     
       //how to read single row data from table
       for(int i=1;i<=5;i++)
       {
    	   
    	 WebElement data1 = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/td["+i+"]"));
    	 	  
    	 System.out.print(data1.getText()+" ");
       }
            System.out.println();
      
            System.out.println("============================================================");
       
	}

}
