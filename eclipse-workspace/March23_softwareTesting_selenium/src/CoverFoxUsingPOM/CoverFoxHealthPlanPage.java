package CoverFoxUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanPage
{
      //webelemnt--> data member
	@FindBy(className = "next-btn")private WebElement next_button;
	
	
	//Constuctor
	public CoverFoxHealthPlanPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Method
	public void ClickOnNextButton()
	{
		next_button.click();
	}
	
}
