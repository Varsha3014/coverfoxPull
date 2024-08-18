package coverFoxPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResultPage1
{
    //webelement-->data member
	@FindBy(xpath = "//div[contains(text(),'Health Insurance Plans')]")private WebElement Maintext;
	@FindBy(xpath =  "//div[@class='plan-card-container']")private List<WebElement> Card_container;
	@FindBy(xpath = "//div[@class='title']")private WebElement sortPlan;
	@FindBy(xpath = "//div[@class='error-ui']")private WebElement PinCodeErrorMsg;
	@FindBy(xpath = "(//div[contains(text(),' Please enter ')])[2]")private WebElement MobileNumberErrorMsg;
	@FindBy(className = "mp-input-text")private WebElement PinCodeText;
	@FindBy(id = "want-expert")private WebElement MobileNumberText;
	@FindBy(xpath = "//div[text()='Continue']")private WebElement ContinueButton;
	
	//constructor
	public CoverFoxResultPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//method
	public void mainResult() throws InterruptedException
	{   
		Thread.sleep(2000);
		 String[] ar = Maintext.getText().split(" ");
		 String numberInString = ar[0];
		int result = Integer.parseInt(numberInString);
		System.out.println("Matching number "+result);
		 List<WebElement> banners = Card_container;
		 int numberofbanners=banners.size();
			System.out.println("Banner numbers "+numberofbanners);
			if(result==numberofbanners)
			{
				System.out.println("Result is matching TC is passed");
			}else
			{
				System.out.println("Result is not matching TC is Filed");
			}
	}
	public int getPlanNumersFromString()
	{
	String ar[]=Maintext.getText().split(" ");
	int result = Integer.parseInt(ar[0]);
	return result;
	}
	public int getPlanNumersFromBanners()
	{
	     List<WebElement> banners = Card_container;
		 int bannerSize=banners.size();
	return bannerSize;
	}   
	public boolean is_displaySortPlan()
	{
		boolean CheckSortPlan = sortPlan.isDisplayed();
		return CheckSortPlan;
	}
	
	public String CheckPincodeErrorMsg()
	{
		String value = PinCodeErrorMsg.getText();
		return value;
		
	}
	public String CheckMobilenumberErrorMsg()
	{
	   String value=MobileNumberErrorMsg.getText();
		return value;
	}
	  public void clickOnContinueButton()
	{
		  ContinueButton.clear();
	}
	
	
    
}

