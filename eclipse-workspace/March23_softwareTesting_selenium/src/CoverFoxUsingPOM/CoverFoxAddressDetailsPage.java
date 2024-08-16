package CoverFoxUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPage
{
  //webelement-->data member
	@FindBy(className = "mp-input-text")private WebElement PinCodeText;
	@FindBy(id = "want-expert")private WebElement MobileNumberText;
	@FindBy(xpath = "//div[text()='Continue']")private WebElement ContinueButton;
	
	
	//Constructor
	public CoverFoxAddressDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//methods
	public void SendkeyOnPinCodeText()
	{
		PinCodeText.sendKeys("422101");
	}
	
	public void SendKeysOnMobileText()
	{
		MobileNumberText.sendKeys("9988998899");
	}
	public void ClickOnContinueButton()
	{
		ContinueButton.click();
	}
}
