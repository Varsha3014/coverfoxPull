package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_study {

	public static void main(String[] args) throws InterruptedException
	{
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    Thread.sleep(2000);
	    driver.switchTo().frame("iframe-name");
	    String mytext = driver.findElement(By.xpath("//strong[text()=' Learn Earn & Shine']")).getText();
	    System.out.println(mytext);
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("courses-iframe");
	    String mytext2 = driver.findElement(By.xpath("//h2[text()='Our Students']")).getText();
	    System.out.println(mytext2);
	}

}
