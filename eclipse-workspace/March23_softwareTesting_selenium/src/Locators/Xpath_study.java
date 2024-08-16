package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_study {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		//use of xpath locator
        //syntax= //tagname[@attribute name = ‘attribute value’]

		driver.findElement(By.xpath("//input[@ name='firstname']")).sendKeys("Tom");
		driver.findElement(By.xpath("//input[@ name='lastname']")).sendKeys("Jerry");
		driver.findElement(By.xpath("//input[@ name='reg_email__']")).sendKeys("Tomandjerry@gmail.com");
	    driver.findElement(By.xpath("//input[@ name='reg_email_confirmation__']")).sendKeys("Tomandjerry@gmail.com");
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tom23$#");
	}

}