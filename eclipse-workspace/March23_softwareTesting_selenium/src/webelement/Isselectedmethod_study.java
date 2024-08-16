package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselectedmethod_study {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		WebElement radiobutton1 = driver.findElement(By.cssSelector(("input[value=radio1]")));
	    //radiobutton1.click();
	    System.out.println(radiobutton1.isSelected());
	    if(radiobutton1.isSelected())
	    {
	    	System.out.println("radiobutton is already selected,thank you");
	    }
	    else
	    {
	    	radiobutton1.click(); //selected the radio button
	    	System.out.println("radiobutton is now selected");
	    }
	    
	
	}

}
