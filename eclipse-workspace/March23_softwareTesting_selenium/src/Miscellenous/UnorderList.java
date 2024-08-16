package Miscellenous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("velocity");
        List<WebElement> resluts =driver.findElements(By.className("erkvQe"));
        System.out.println(resluts.size());//10
        Thread.sleep(2000);
        //for each
        for(WebElement r:resluts)
        {
        	System.out.println(r.getText());
        }
        
        	  
	
	}

}
