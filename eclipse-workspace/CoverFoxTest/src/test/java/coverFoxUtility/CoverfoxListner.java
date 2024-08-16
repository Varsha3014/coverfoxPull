package coverFoxUtility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import coverFoxBase.Base;

public class CoverfoxListner extends Base implements ITestListener
{
   public void onTestStart(ITestResult result)

   {
	   Reporter.log(result.getName()+"TC Execution Started",true);
   }
   
   public void onTestFailure(ITestResult result)
   {
	   Reporter.log("TC"+result.getName()+" is Failed",true);
	   try {
		Utility.TakeScreenShot(driver,result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
