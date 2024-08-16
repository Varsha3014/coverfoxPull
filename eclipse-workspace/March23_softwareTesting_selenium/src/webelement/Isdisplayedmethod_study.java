package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayedmethod_study {

	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://rahulshettyacademy.com/AutomationPractice");
       WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
       WebElement showbutton = driver.findElement(By.id("show-textbox"));
       Thread.sleep(2000);
       hidebutton.click();
       //showbutton.click();
       Thread.sleep(2000);
       WebElement hiddentextbox = driver.findElement(By.id("displayed-text"));
       if(hiddentextbox.isDisplayed())
       {
    	   hiddentextbox.sendKeys("Pune");
       }
       else
       {
    	   showbutton.click();
    	   hiddentextbox.sendKeys("Nashik");
    	   System.out.println("Element is not display ,cant send keys");
       }
       

	}

}
