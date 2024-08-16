package listenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listner implements ITestListener
{
	public void onTestStart(ITestResult result)
   {
		Reporter.log("TC " +result.getName()+" execution started", true);
   }
	
	public void  onTestSuccess(ITestResult result)
	{
		Reporter.log("TC"+result.getName()+"completed successfully",true);
		
	}
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC"+result.getName()+"Failed",true);
	}
	
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC"+result.getName()+"Skipped",true);
	}
}
