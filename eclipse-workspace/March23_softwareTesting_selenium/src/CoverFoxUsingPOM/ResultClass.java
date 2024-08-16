package CoverFoxUsingPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ResultClass {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		CoverFoxHomePage home=new CoverFoxHomePage(driver);
		home.ClickOnMaleButton();
		CoverFoxHealthPlanPage health=new CoverFoxHealthPlanPage(driver);
		health.ClickOnNextButton();
		CoverFoxMembaerDetailsPage member=new CoverFoxMembaerDetailsPage(driver);
		member.SelectDropDownAge();
		member.ClickOnNextButton();
		CoverFoxAddressDetailsPage address=new CoverFoxAddressDetailsPage(driver);
		address.SendkeyOnPinCodeText();
		address.SendKeysOnMobileText();
		address.ClickOnContinueButton();
		CoverFoxResultPage result=new CoverFoxResultPage(driver);
		result.mainResult();

	}

}
