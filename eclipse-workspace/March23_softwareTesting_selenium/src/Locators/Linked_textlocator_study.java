package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Linked_textlocator_study {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
	   // WebElement OpenTab  = driver.findElement(By.linkText("Open Tab"));
	   //OpenTab.click();
		//partialLinkedtext locator
		WebElement OpenTab = driver.findElement(By.partialLinkText("Op"));
		Thread.sleep(2000);
	   OpenTab.click();
	}

}
