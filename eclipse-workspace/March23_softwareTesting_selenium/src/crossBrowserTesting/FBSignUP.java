package crossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class FBSignUP {
	 WebDriver driver;
   @Parameters("browserName")
   @Test
   public void CrossBrowser(String bname) throws InterruptedException 
  {
	  
	  if(bname.equalsIgnoreCase("Chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(bname.equalsIgnoreCase("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  else if(bname.equalsIgnoreCase("edge"))
	  {
		  driver=new EdgeDriver();
	  }
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  driver.get("https://www.facebook.com/signup");
	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("varsha");
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gurule");
	  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9898989898");
	  Thread.sleep(1000);
	  driver.close();
	  
	  
	  
	  
	  
  }
}
