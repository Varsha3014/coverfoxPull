package TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationForMethod {
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("Before method is running",true);
	}
  @Test
  public void A() {
	  Reporter.log("Method A is running",true);
  }
  
  @Test
  public void B()
  {
	  Reporter.log("Method  B is runing ",true);
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("After Method is running ",true);
  }
}
