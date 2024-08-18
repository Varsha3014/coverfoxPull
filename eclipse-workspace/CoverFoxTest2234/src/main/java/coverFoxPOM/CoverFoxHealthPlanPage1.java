package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxHealthPlanPage1
{
      //webelemnt--> data member
	@FindBy(className = "next-btn")private WebElement next_button;
	
	
	//Constuctor
	public CoverFoxHealthPlanPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Method
	public void ClickOnNextButton()
	{
		next_button.click();
		Reporter.log("ClickOn next Button",true);		
	}
	
}
