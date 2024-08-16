package TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutKeyword {
  @Test
  public void x1()
  {
	  Reporter.log("Method x1 is running",true);
  }
  
  @Test (timeOut =3000)
  public void y1() throws InterruptedException
  {    
	  Thread.sleep(2000);
	  Reporter.log("Method y1 is running",true);
  }
  
}
