package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullNotnull
{
	@Test
	public void Methods()
	{
		String s=null;
		String s1="ACBV";
		//Assert.assertNull(s1,"value of s1 is not null");
		//Assert.assertNull(s);
		//Assert.assertNotNull(s,"Value of s is null");
		Assert.assertNotNull(s1);
		Assert.fail();// for Intentionally fail test case
	}
	

}
