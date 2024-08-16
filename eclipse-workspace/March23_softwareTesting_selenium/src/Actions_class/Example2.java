package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//click action using Actions class
		//1. Find the target element and store in ref variable
       WebElement RadioButton1 = driver.findElement(By.cssSelector("input[value=radio1]"));
      Actions action=new Actions(driver);
      //action.moveToElement(RadioButton1).click().perform();
		action.click(RadioButton1).perform();
	}

}
