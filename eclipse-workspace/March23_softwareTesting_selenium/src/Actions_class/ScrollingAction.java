package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		//Scrolling
		//1.
         WebElement PaytemPayment = driver.findElement(By.xpath("(//h1[contains(text(),'Paytm')])[3]"));
	    Actions action=new Actions(driver);
	    Thread.sleep(2000);
	    action.scrollToElement(PaytemPayment).perform();
	}

}
