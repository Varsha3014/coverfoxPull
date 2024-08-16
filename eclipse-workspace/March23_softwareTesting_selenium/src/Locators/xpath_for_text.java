package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_for_text {

	public static void main(String[] args) 
	{
		//xpath using text
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.xpath("//span[text()='Uncover the wonders of your world and beyond']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[value=radio1]")).click();
	}

}
