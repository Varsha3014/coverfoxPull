package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) throws InterruptedException {
		//drag and drop
	     WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		//1. find Element and store ref variable
		WebElement Source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		//action.dragAndDrop(Source, target).perform();
		action.clickAndHold(Source).moveToElement(target).release().build().perform();
		

	}

}
