package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass_usingMouseAction {

	public static void main(String[] args) throws InterruptedException
	{

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
      //Right click(context click) using Actions class
      //1.Find the element and store in reference variable
        WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
      //2. Create an object of Actions Class, pass driver object as an argument
        Actions action=new Actions(driver);
      //3. Using Actions class object take necessary action
        //action.moveToElement(rightClickButton).contextClick().build().perform();
	  //right click using action class
        action.contextClick(rightClickButton).perform();
        
        //double click using action class
        //1.find the element and store in reference variable
        WebElement DoubleClickButtom = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
        //Using Actions class object take necessary action
       //action.moveToElement(DoubleClickButtom).contextClick().build().perform();
        Thread.sleep(2000);
        action.contextClick(DoubleClickButtom).perform();
	}

}
