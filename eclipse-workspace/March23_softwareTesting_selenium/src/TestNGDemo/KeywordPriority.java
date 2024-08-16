package TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordPriority {
  @Test(priority = -4)
  public void x() {
	  Reporter.log("Method x is running",true);
  }
  
  @Test(priority = 1)
  public void y() {
	  Reporter.log("Method y is running",true);
  }
  
  @Test(priority = -2)
  public void z() {
	  Reporter.log("Method z is running",true);
  }
  
  @Test(priority = 2)
  public void a() {
	  Reporter.log("Method a is running",true);
  }
}
