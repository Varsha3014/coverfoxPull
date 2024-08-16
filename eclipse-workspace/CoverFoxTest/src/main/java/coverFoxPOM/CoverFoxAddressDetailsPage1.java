package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
@Test
public class CoverFoxAddressDetailsPage1
{
  //webelement-->data member
	@FindBy(className = "mp-input-text")private WebElement PinCodeText;
	@FindBy(id = "want-expert")private WebElement MobileNumberText;
	@FindBy(xpath = "//div[text()='Continue']")private WebElement ContinueButton;
	
	
	//Constructor
	public CoverFoxAddressDetailsPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//methods
	public void SendkeyOnPinCodeText(String pincode)
	{
		PinCodeText.sendKeys(pincode);
		Reporter.log("Reading Pincode",true);
	}
	
	public void SendKeysOnMobileText(String mobileNumber)
	{
		MobileNumberText.sendKeys(mobileNumber);
		Reporter.log("Reading MobileNumber",true);
	}
	public void ClickOnContinueButton()
	{
		ContinueButton.click();
		Reporter.log("clickOnContinueButton",true);
	}
}
