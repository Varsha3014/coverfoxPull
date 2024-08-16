package TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledKeyword {
  @Test
  public void demo()
  {
	  Reporter.log("Demo method is running",true);
  }
  @Test(enabled = false)
  public void sample()
  {
	  Reporter.log("Sample method is running",true);
  }
}
