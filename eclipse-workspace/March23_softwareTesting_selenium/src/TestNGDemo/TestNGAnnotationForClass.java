package TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationForClass {
  @Test
  public void a() {
	  Reporter.log("Method a is running",true);
  }
  @BeforeMethod
    public void beforeMethod()
      {
	  Reporter.log("Before Method is Runing",true);
	  }
  
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("Before class is running",true);
  }
  @Test
  public void b() {
	  Reporter.log("Method b is running",true);
  }
  @AfterMethod
  public void afterMethod()
  {
  Reporter.log("After Method is Runing",true);
  }
  @Test
  public void c() {
	  Reporter.log("Method c is running",true);
  }
  @AfterClass
  public void AfterClass()
  {
	  Reporter.log("After class is running",true);
  }
}
