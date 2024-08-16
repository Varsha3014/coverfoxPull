package TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodKeywords {
  @Test(dependsOnMethods = "Example")
  public void sample() 
  {
	  Reporter.log("Sample method is running",true);
  }
  
  @Test
  public void Demo() 
  {
	  Reporter.log("demo method is running",true);
  }
  
  @Test
  public void Example() 
  {
	  Reporter.log("Example method is running",true);
  }
}
