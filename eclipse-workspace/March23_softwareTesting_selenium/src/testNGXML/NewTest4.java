package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest4 {
  @Test(groups = {"Regression"})
  public void p() 
  {
	  Reporter.log("P method is running",true);
  }
  @Test(groups = {"Sanity"})
  public void q() 
  {
	  Reporter.log("Q method is running",true);
  }
  @Test(groups = {"Sanity"})
  public void r() 
  {
	  Reporter.log("R method is running",true);
  }
  @Test(groups = {"Regression"})
  public void s() 
  {
	  Reporter.log("S method is running",true);
  }
}
