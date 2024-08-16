package SetsizeSetpostion;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		Dimension DefaultSize = driver.manage().window().getSize();
		System.out.println(DefaultSize);
		//to set the Size we need to craete object of Dimension class
		Thread.sleep(2000);
		Dimension d=new Dimension(800, 450);
		driver.manage().window().setSize(d);
		
	}

}

