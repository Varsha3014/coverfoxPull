package CoverFoxUsingPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResultPage
{
    //webelement-->data member
	@FindBy(xpath = "//div[contains(text(),'Health Insurance Plans')]")private WebElement Maintext;
	@FindBy(xpath =  "//div[@class='plan-card-container']")private List<WebElement> Card_container;
	
	
	//constructor
	public CoverFoxResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//method
	public void mainResult() throws InterruptedException
	{   
		Thread.sleep(2000);
		String mytext = Maintext.getText();
		System.out.println(mytext);
		String[] ar = mytext.split(" ");
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
}
