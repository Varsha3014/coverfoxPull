package Common_method;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common_methoduse {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		//WebElement element = driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']"));
		//WebElement element = driver.findElement(By.id("opentab"));
		Thread.sleep(1000);
        //Utility.scrollIntoView(driver, element);
        //Thread.sleep(1000);
       
        //Thread.sleep(1000);
        //Utility.Clickon(driver, element);
        Thread.sleep(2000);
        //String filename ="minu";
      //  Utility.TakeScreenShot(driver,filename);
        Thread.sleep(2000);
        String filepath = ("D:\\excel\\Stringdata.xlsx");
        String sheetnum = "Sheet1";
        Thread.sleep(1000);
        String value = Utility.ExcetDataRead(filepath,sheetnum, 1, 2);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(value);
        
        
	}

}
