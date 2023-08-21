package listner;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener
{
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String TCname = result.getName();
		Reporter.log("This"+TCname+" method completed successfuly", true);
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		
		Reporter.log("This"+result.getName()+" method is failed,plz try again", true);
	}
	
	@Override
	public void onTestStart(ITestResult result)
	{
		Reporter.log("Test "+result.getName()+" excution start", true);
	}
	
	 @Override
	public void onTestSkipped(ITestResult result)
	 {
		 
		Reporter.log("This"+result.getName()+" TC is skipped plz check dependent method", true);
	}

}
