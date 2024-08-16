package CoverFoxUsingPOM1.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	}
	
	public void SendKeysOnMobileText(String mobileNumber)
	{
		MobileNumberText.sendKeys(mobileNumber);
	}
	public void ClickOnContinueButton()
	{
		ContinueButton.click();
	}
}
