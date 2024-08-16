package coverFoxUsingTestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common_method.Utility;
import coverFoxPOM.CoverFoxAddressDetailsPage1;
import coverFoxPOM.CoverFoxHealthPlanPage1;
import coverFoxPOM.CoverFoxHomePage1;
import coverFoxPOM.CoverFoxMembaerDetailsPage1;
import coverFoxPOM.CoverFoxResultPage1;

public class CoverFoxUsingPropertise
{
	WebDriver driver;
	 CoverFoxHomePage1 home;
	 CoverFoxHealthPlanPage1 health;
	 CoverFoxMembaerDetailsPage1 member;
	 CoverFoxAddressDetailsPage1  address;
	 CoverFoxResultPage1 result;

	
	@BeforeTest
	public void launchBrowser() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://www.coverfox.com/");
		
		home=new CoverFoxHomePage1(driver);
		health=new CoverFoxHealthPlanPage1(driver);
		address=new CoverFoxAddressDetailsPage1(driver);
		member=new CoverFoxMembaerDetailsPage1(driver);
		result=new CoverFoxResultPage1(driver);
		
	}
	
	@BeforeClass
	public void preConditions() throws InterruptedException, IOException
	{
		// Home-Page
		Thread.sleep(10000);
		home=new CoverFoxHomePage1(driver);
		home.ClickOnMaleButton();

		// Health-Plan Page
		Thread.sleep(2000);
		health=new CoverFoxHealthPlanPage1(driver);
		health.ClickOnNextButton();

		// Member-details Page
		Thread.sleep(2000);
		member=new CoverFoxMembaerDetailsPage1(driver);
//		memberDetails.selectAgeDropDown(age);
		member.SelectDropDownAge(Utility.readDataFromProertyFile("age"));
		member.ClickOnNextButton();

		Thread.sleep(2000);

		// Address-Details Page
		address=new CoverFoxAddressDetailsPage1(driver);
		address.SendkeyOnPinCodeText(Utility.readDataFromProertyFile("pincode"));
		address.SendKeysOnMobileText(Utility.readDataFromProertyFile("mobno"));
		address.ClickOnContinueButton();

		Thread.sleep(2000);

	}

	  @Test
	    public void validateBanners() throws InterruptedException
	    {
	    	Thread.sleep(4000);
	    	int bannerPlanNumbers = result.getPlanNumersFromBanners();
	    	int StringplanNumbers = result.getPlanNumersFromString();
	    	Assert.assertEquals(StringplanNumbers, bannerPlanNumbers,"Plans on banners not matching with results, TC failed");
	    
	    }
	    @Test
	    public void ChecksortPlan() throws InterruptedException
	    {
	       Thread.sleep(4000);
	       Assert.assertTrue(result.is_displaySortPlan(),"Sort plan Dropdown is not display,TC is fail");    	
	    }
	  
}	


