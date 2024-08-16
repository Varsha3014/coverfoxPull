package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy 
{
	@Test
	public void myTest()
	{
		String s1="Pune";
		String s2="Mumbai";
		String s3=null;
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(s2, s1,"S1 and S2 are not equals");
		soft.assertNull(s3);
		soft.assertAll();
	}
 /* @Test
  public void myTest1() {
  boolean x = true;
  String s1=null;
  SoftAssert soft = new SoftAssert();
  soft.assertTrue(x);
  soft.assertNotNull(s1,"S1 is null");
  soft.assertAll();*/
  
}
