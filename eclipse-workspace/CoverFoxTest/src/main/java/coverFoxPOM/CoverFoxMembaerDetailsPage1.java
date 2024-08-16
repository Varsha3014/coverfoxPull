package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

//import excel.readwholedata;

public class CoverFoxMembaerDetailsPage1 
{
     //webelement-->data member
	@FindBy(xpath = "//select[@id='Age-You']")private WebElement AgeDropDwonBotton;
	@FindBy(className = "next-btn")private WebElement next_button;
	
	
	//constructor
	public CoverFoxMembaerDetailsPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	public void SelectDropDownAge(String age)
	{
		Select s=new Select( AgeDropDwonBotton);
		s.selectByValue(age+"y");
		Reporter.log("Age is Selected",true);
	    //s.selectByVisibleText(age+"years");
	}
   
	public void ClickOnNextButton()
	{
		next_button.click();
		Reporter.log("Click on next button",true);
	}




}
