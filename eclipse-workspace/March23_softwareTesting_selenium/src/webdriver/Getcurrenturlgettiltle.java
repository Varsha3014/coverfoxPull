package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrenturlgettiltle {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		String Mytitle = driver.getTitle();
		System.out.println(Mytitle);
		
		String currenturl = driver.getCurrentUrl();
	    System.out.println(currenturl);
}
}