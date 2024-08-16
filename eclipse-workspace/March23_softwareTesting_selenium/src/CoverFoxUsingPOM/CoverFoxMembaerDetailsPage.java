package CoverFoxUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMembaerDetailsPage 
{
     //webelement-->data member
	@FindBy(id ="Age-You") private WebElement AgeDropDwonButton;
	@FindBy(className = "next-btn")private WebElement next_button;
	
	
	//constructor
	public CoverFoxMembaerDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	public void SelectDropDownAge()
	{
		Select s=new Select(AgeDropDwonButton);
		s.selectByValue("26y");
	}
   
	public void ClickOnNextButton()
	{
		next_button.click();
	}




}
