package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classlocator_study {

	public static void main(String[] args)
	{
		
           WebDriver driver=new ChromeDriver();
           driver.get("https://rahulshettyacademy.com/AutomationPractice/");
           WebElement text = driver.findElement(By.className("radioButton"));
           text.click();
	}

}
