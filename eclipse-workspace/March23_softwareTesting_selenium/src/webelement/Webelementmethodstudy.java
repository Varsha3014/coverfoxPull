package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementmethodstudy {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).sendKeys("Varsha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).sendKeys("Rani");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).clear();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[contains(@id,'u_0_4')]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_5')]")).click();
		Thread.sleep(1000);
		String mytext = driver.findElement(By.xpath("//div[contains(text(),'new account')]")).getText();
		System.out.println(mytext);
		Thread.sleep(1000);
		
	}

}
