package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDrawBack
{
    @Test
    public void Methods()
    {
    	String s="Pune";
    	String s1="Mumbai";
    	Assert.assertEquals(s,s1);
    	Assert.assertNotEquals(s,s1);
    	//draw back of hard assert is cannot execute all methods at time..if one method is fail then
    	//another method is skip by HARD assert can not execute that one
    	
    }
    
}
