package Assigenment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCexample {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://IRCTC.co.in");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='icn'])[3]"));

	}

}
