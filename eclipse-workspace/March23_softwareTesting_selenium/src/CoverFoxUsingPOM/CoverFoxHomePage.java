package CoverFoxUsingPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage 
{
     //Web elements --->data members
	@FindBy(xpath = "//div[text()='Male']")
	private WebElement maleButton;
	
	
	//create constructor
	public CoverFoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnMaleButton()
	{
		maleButton.click();
	}
}
