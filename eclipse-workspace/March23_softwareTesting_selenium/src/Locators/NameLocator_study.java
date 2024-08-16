package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator_study {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		Thread.sleep(1000);
		WebElement emailfeild = driver.findElement(By.name("email"));
		emailfeild.sendKeys("Mickeymouse11.com");
	}

}
