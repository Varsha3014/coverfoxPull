package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalse {
  @Test
  public void f()
  {
	 boolean a = true;
	 boolean b = false;
	// Assert.assertTrue(b,"Value of b is false,TC is failed");
	 //Assert.assertTrue(a);
	 //Assert.assertFalse(a,"Value of a is True,TC is failed");
	 Assert.assertFalse(b);
	 
	  
  }
}
