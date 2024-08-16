package TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Myclass {
	
	@BeforeMethod
	public void b1()
	{
	  Reporter.log("This before method ",true);
	}
  @Test
  public void f() 
  {
	  System.out.println("Hello TestNG");
  }
  @Test
  public void f1()
  {
	  Reporter.log("Varsha");
  }
  @Test
  public void f2()
  {
	  Reporter.log("Shreesha" ,true);

  }
  @AfterMethod
  public void a1()
  {
	  Reporter.log("This is after method",true);
	  
  }
}
