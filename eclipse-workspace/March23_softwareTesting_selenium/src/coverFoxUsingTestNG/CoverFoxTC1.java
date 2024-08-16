package coverFoxUsingTestNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class CoverFoxTC1 
{
    WebDriver driver;
    CoverFoxHomePage1 homePage;
    CoverFoxHealthPlanPage1 healthPlanPage;
    CoverFoxAddressDetailsPage1 addressDetailPage;
    CoverFoxMembaerDetailsPage1 memberDetailPage;
    CoverFoxResultPage1  resultPage;
    String FilePath;
    @BeforeTest
    public void launchBrowser()
    {
    	ChromeOptions opt=new ChromeOptions();
    	opt.addArguments("--disable-notifications");
    	driver=new ChromeDriver(opt);
    	driver.manage().window().maximize();
    	driver.get("https://www.coverfox.com/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    	homePage=new CoverFoxHomePage1(driver);
    	healthPlanPage=new CoverFoxHealthPlanPage1(driver);
    	addressDetailPage=new CoverFoxAddressDetailsPage1(driver);
    	memberDetailPage=new CoverFoxMembaerDetailsPage1(driver);
    	resultPage=new CoverFoxResultPage1(driver);
    	FilePath="D:\\excel\\Stringdata.xlsx";
     }
    
    @BeforeClass
    public void preconditions() throws InterruptedException, EncryptedDocumentException, IOException
    {
    	homePage.ClickOnMaleButton();
    	Thread.sleep(1000);
    	healthPlanPage.ClickOnNextButton();
    	Thread.sleep(1000);
    	memberDetailPage.SelectDropDownAge(Utility.ExcetDataRead(FilePath,"Sheet2", 0, 0));
    	memberDetailPage.ClickOnNextButton();
    	Thread.sleep(1000);
    	addressDetailPage.SendkeyOnPinCodeText(Utility.ExcetDataRead(FilePath, "Sheet2", 0, 1));
    	addressDetailPage.SendKeysOnMobileText(Utility.ExcetDataRead(FilePath, "Sheet2", 0, 2));
    	Thread.sleep(1000);
    	resultPage.clickOnContinueButton();
    }
    @Test
    public void CheckingPinCodeErrorMsg()
    {
    	String ActualErroMsg = resultPage.CheckPincodeErrorMsg();
    	String ExpectedErromsg="Please Enter a valid pincode";
    	Assert.assertEquals(ActualErroMsg,ExpectedErromsg,"Validation Error msg for pincode is not matching,TC is Fail");
    	
    }
    
    @Test
    public void CheckingMobileNumberErrorMsg()
    {
    	String ActualMobileFieldErrormsg=resultPage.CheckMobilenumberErrorMsg();
    	String ExpectedMobileFieldErrormsg="Please Enter valid mobile no";
    	Assert.assertEquals(ActualMobileFieldErrormsg,ExpectedMobileFieldErrormsg,"Validation Error msg for MobileNumber is not matching,TC is Fail");
    	
    }
    
    @Test
    public void validateBanners() throws InterruptedException
    {
    	Thread.sleep(4000);
    	int bannerPlanNumbers = resultPage.getPlanNumersFromBanners();
    	int StringplanNumbers = resultPage.getPlanNumersFromString();
    	Assert.assertEquals(StringplanNumbers, bannerPlanNumbers,"Plans on banners not matching with results, TC failed");
    
    }
    @Test
    public void ChecksortPlan() throws InterruptedException
    {
       Thread.sleep(4000);
       Assert.assertTrue(resultPage.is_displaySortPlan(),"Sort plan Dropdown is not display,TC is fail");    	
    }
    @AfterClass
    public void CloseBrowser()
    {
    	driver.close();
    }
	
}
