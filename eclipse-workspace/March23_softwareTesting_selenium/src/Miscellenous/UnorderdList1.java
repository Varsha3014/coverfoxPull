package Miscellenous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderdList1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("munjya");
		Thread.sleep(2000);
		List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println(result.size());
	   //	foreach
		for(WebElement r:result)
		{
			System.out.println(r.getText());
		}
		Thread.sleep(1000);
		String required ="munjya cast";
		for(WebElement r:result)
		{
			String actual_text = r.getText();
			Thread.sleep(1000);
			if(actual_text.equals(required))
			{
				r.clear();
				break;
			}
			
		}

	}

}
