package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestediframe1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
        Thread.sleep(2000);
        driver.switchTo().frame("frame1");
        String parentframetext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
	    System.out.println(parentframetext);
	    Thread.sleep(2000);
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
	   String childframetext = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	   System.out.println(childframetext);
	   Thread.sleep(2000);
	   driver.switchTo().defaultContent();
	   String mainframetext = driver.findElement(By.xpath("//h1[text()='Nested Frames']")).getText();
	   System.out.println(mainframetext);
	}

}
