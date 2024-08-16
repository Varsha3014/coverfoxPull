package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php");
		Thread.sleep(1000);
		WebElement NameField = driver.findElement(By.name("firstname"));
		Actions action=new Actions(driver);
		//action.sendKeys(NameField,"Varsha").perform();
		action.keyDown(NameField,Keys.SHIFT).sendKeys("varsha").keyUp(Keys.SHIFT).build().perform();
	}

}
