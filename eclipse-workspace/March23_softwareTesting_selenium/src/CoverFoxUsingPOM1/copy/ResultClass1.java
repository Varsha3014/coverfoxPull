package CoverFoxUsingPOM1.copy;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Common_method.Utility;

public class ResultClass1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		String filepath="D:\\excel\\Stringdata.xlsx";
		String age=Utility.ExcetDataRead(filepath,"Sheet2", 1, 0);
		String pincode=Utility.ExcetDataRead(filepath,"Sheet2", 1, 1);
		String mobileNumber=Utility.ExcetDataRead(filepath,"Sheet2", 1, 2);
		CoverFoxHomePage1 home=new CoverFoxHomePage1(driver);
		home.ClickOnMaleButton();
		CoverFoxHealthPlanPage1 health=new CoverFoxHealthPlanPage1(driver);
		health.ClickOnNextButton();
		CoverFoxMembaerDetailsPage1 member=new CoverFoxMembaerDetailsPage1(driver);
		Thread.sleep(1000);
		member.SelectDropDownAge(age);
		member.ClickOnNextButton();
		CoverFoxAddressDetailsPage1 address=new CoverFoxAddressDetailsPage1(driver);
		address.SendkeyOnPinCodeText(pincode);
		address.SendKeysOnMobileText(mobileNumber);
		address.ClickOnContinueButton();
		CoverFoxResultPage1 result=new CoverFoxResultPage1(driver);
		result.mainResult();

	}

}
