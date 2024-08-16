package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBSignUpByExcelData
{
	@Test(dataProvider="FamilyMember",dataProviderClass =dataProvider.DataProviderUsingExcelUtility.class)
	public void mydata(String name,String lastName,String mobNum) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys(name);
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.name("reg_email__")).sendKeys(mobNum);
		Thread.sleep(2000);
		driver.close();
	}

}
