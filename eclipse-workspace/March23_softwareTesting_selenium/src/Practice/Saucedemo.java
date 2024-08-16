package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String mytext = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).getText();
		System.out.println(mytext);
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='1']")).click();
	}

}
