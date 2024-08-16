package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethod_study {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[@id='opentab']")).click();
         Thread.sleep(1000);
        // driver.close();  //close current tab
         //driver.quit();   //close all tab which is open using selenium tool
         
         driver.manage().window().maximize();
         Thread.sleep(1000);
         //driver.manage().window().minimize();
         driver.get("https://www.facebook.com/");
         Thread.sleep(1000);
         driver.navigate().back();
         Thread.sleep(1000);
         driver.navigate().forward();
         Thread.sleep(1000);
         driver.navigate().refresh();
         driver.navigate().to("https://www.redbus.in");
         
	}

}
