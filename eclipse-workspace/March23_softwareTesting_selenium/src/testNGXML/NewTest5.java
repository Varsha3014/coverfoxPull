package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest5 {
  @Test
  public void l()
  {
	  Reporter.log("L method is running",true);
  }
  @Test(groups = {"Regression"})
  public void m()
  {
	  Reporter.log("M method is running",true);
  }
  @Test(groups = {"Sanity"})
  public void n()
  {
	  Reporter.log("N method is running",true);
  }
  @Test(groups = {"Sanity"})
  public void o()
  {
	  Reporter.log("O method is running",true);
  }
}
