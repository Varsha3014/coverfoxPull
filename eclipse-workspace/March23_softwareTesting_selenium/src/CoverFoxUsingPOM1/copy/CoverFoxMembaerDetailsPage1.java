package CoverFoxUsingPOM1.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMembaerDetailsPage1 
{
     //webelement-->data member
	@FindBy(xpath = "//select[@name='You']")private WebElement AgeDropDwonButton;
	@FindBy(className = "next-btn")private WebElement next_button;
	
	
	//constructor
	public CoverFoxMembaerDetailsPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	public void SelectDropDownAge(String age)
	{
		Select s=new Select(AgeDropDwonButton);
	    s.selectByValue(age+" y");
	   // s.selectByVisibleText(age+"years");
	}
   
	public void ClickOnNextButton()
	{
		next_button.click();
	}




}
