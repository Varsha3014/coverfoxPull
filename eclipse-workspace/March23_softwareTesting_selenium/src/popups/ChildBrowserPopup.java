package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/auth");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-google-button']")).click();
		String WindowIdmainpage = driver.getWindowHandle();
		System.out.println(WindowIdmainpage);
		Set<String> AllWindowsId = driver.getWindowHandles();
		System.out.println(AllWindowsId);
	    ArrayList<String> al=new ArrayList<String>(AllWindowsId);
	    String MainpageId=al.get(0);
	    String ChildpageId=al.get(1);
	    
	   // by using iterator find the id of particular  window which we want
	    //Iterator<String> it = al.iterator();
	   // String mainPageID = it.next();
	   // String childPageID = it.next();
	    
	    driver.switchTo().window(ChildpageId);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test1234@gmail.com");
	    Thread.sleep(2000);
	    System.out.println(driver.findElement(By.xpath("//span[text()='Sign in']")).getText());
	    driver.close();// close child window
	    Thread.sleep(1000);
	    driver.switchTo().window(MainpageId);
	    System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Email ')]")).getText());
	    }

}
