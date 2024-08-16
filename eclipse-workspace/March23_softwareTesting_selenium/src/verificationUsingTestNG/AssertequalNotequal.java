package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertequalNotequal
{
	@Test
	public void method()
	{
		String s1="Pune";
		String s2="Mumbai";
		String s3="Pune";
		//Assert.assertEquals(s1,s2,"Value of s1 and s2 is not  matching");
		Assert.assertNotEquals(s1,s3,"Value of S1 and s3 are equal");
		Assert.assertNotEquals(s1, s3,"Value of s1 and s3 are matching");
		
	}
	

}
