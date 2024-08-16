package coverFoxTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import coverFoxUtility.Utility;
import coverFoxBase.Base;
import coverFoxPOM.CoverFoxAddressDetailsPage1;
import coverFoxPOM.CoverFoxHealthPlanPage1;
import coverFoxPOM.CoverFoxHomePage1;
import coverFoxPOM.CoverFoxMembaerDetailsPage1;
import coverFoxPOM.CoverFoxResultPage1;
@Listeners(coverFoxUtility.CoverfoxListner.class)
public class CoverfoxTC1Listeners extends Base
{
     CoverFoxHomePage1 homePage;
     CoverFoxHealthPlanPage1 healthPlan;
     CoverFoxAddressDetailsPage1 addressPage;
     CoverFoxMembaerDetailsPage1 memberPage;
     CoverFoxResultPage1 resultPage;
     String Filepath;
 
   @BeforeTest
     public void launchBrowser()
   {
    openBrowser();
    homePage=new CoverFoxHomePage1(driver);
	healthPlan=new CoverFoxHealthPlanPage1(driver);
	addressPage=new CoverFoxAddressDetailsPage1(driver);
	memberPage=new CoverFoxMembaerDetailsPage1(driver);
	resultPage=new CoverFoxResultPage1(driver);
	Filepath="D:\\excel\\Stringdata.xlsx";
   }
   @BeforeClass
   public void preconditions() throws InterruptedException, IOException 
   {
      // Home-Page
		Thread.sleep(10000);
		homePage=new CoverFoxHomePage1(driver);
		homePage.ClickOnMaleButton();

		// Health-Plan Page
		Thread.sleep(2000);
		healthPlan=new CoverFoxHealthPlanPage1(driver);
		healthPlan.ClickOnNextButton();

		// Member-details Page
		Thread.sleep(2000);
		memberPage=new CoverFoxMembaerDetailsPage1(driver);
        memberPage.SelectDropDownAge(Utility.readDataFromProertyFile("age"));
		memberPage.ClickOnNextButton();

		Thread.sleep(2000);

		// Address-Details Page
		addressPage=new CoverFoxAddressDetailsPage1(driver);
		addressPage.SendkeyOnPinCodeText(Utility.readDataFromProertyFile("pincode"));
		addressPage.SendKeysOnMobileText(Utility.readDataFromProertyFile("mobno"));
		addressPage.ClickOnContinueButton();

		Thread.sleep(2000);

   }
   
   @Test
   public void validateBanners() throws InterruptedException
   {
   	Thread.sleep(4000);
    Assert.fail();
   	int bannerPlanNumbers = resultPage.getPlanNumersFromBanners();
   	int StringplanNumbers = resultPage.getPlanNumersFromString();
   	Assert.assertEquals(StringplanNumbers, bannerPlanNumbers,"Plans on banners not matching with results, TC failed");
   
   }
   @Test
   public void ChecksortPlan() throws InterruptedException
   {
      Thread.sleep(4000);
      Assert.fail();
      Assert.assertTrue(resultPage.is_displaySortPlan(),"Sort plan Dropdown is not display,TC is fail");    	
   }
   @AfterClass
   public void CloseBrowser()
   {
   	driver.close();
   }
   
}
