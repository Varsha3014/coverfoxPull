package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocator_study {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		WebElement mobilenumberfeild = driver.findElement(By.id("mobileNumber"));
		mobilenumberfeild.sendKeys("7878787878");

	}

}

