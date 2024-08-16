package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		WebElement Formfield = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Formfield.sendKeys("pun");
		Actions action=new Actions(driver);
		WebElement Dropdownforform = driver.findElement(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']"));
		 action.moveToElement(Dropdownforform).perform();
		 for(int i=1;i<=4;i++)
		 {
			 action.sendKeys(Dropdownforform,Keys.ARROW_DOWN).perform();
			 Thread.sleep(2000);
		 }
		 Thread.sleep(1000);
		 action.sendKeys(Dropdownforform,Keys.ENTER);
	}

}
