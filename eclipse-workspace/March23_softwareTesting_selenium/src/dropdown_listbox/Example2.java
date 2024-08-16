package dropdown_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2 {

	public static void main(String[] args) throws InterruptedException
    {
		WebDriver driver;
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		//driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		  WebElement day = driver.findElement(By.id("day"));
		 Select sday=new Select(day);
		 sday.selectByIndex(7);
		 Thread.sleep(2000);
         WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	     Select smonth=new Select(month);
	     smonth.selectByValue("10");
	     Thread.sleep(2000);
	      WebElement year = driver.findElement(By.id("year"));
          Select syear=new Select(year);
          syear.selectByVisibleText("2007");
        //to check if drop down is multi selectable or not
         System.out.println(syear.isMultiple());
          
    }

}
