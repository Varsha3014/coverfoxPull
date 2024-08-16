package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_use {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.redbus.in/");
	}

}
