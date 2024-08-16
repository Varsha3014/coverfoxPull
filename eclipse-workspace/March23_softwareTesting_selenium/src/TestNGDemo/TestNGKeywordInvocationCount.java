package TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeywordInvocationCount {
  @Test
  public void a() {
	  Reporter.log("Method a is running ",true);
  }
  
  @Test(invocationCount = 3)
  public void b() {
	  Reporter.log("Method b is running ",true);
  }
}
