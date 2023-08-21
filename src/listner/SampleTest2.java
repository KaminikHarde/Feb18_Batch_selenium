package listner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest2 {
  @Test
  public void TC5()
  {
	  Reporter.log("TC 5 is running", true);
  }
  
  @Test
  public void TC6()
  {
	  Assert.fail();
	  Reporter.log("TC 6 is running", true);
  }
  
  @Test(dependsOnMethods = "TC6")
  public void TC7()
  {
	  Reporter.log("TC 7 is running", true);
  }
  
  @Test
  public void TC8()
  {
	  Reporter.log("TC 8 is running", true);
  }
   
}
