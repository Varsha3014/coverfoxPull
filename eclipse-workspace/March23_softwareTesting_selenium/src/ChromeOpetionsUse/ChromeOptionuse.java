package ChromeOpetionsUse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class ChromeOptionuse {

	public static void main(String[] args) throws IOException 
	{
		
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("start-maximized");
		//option.addArguments("incognito");
		option.addArguments("headless");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.className("gLFyf")).sendKeys("Velocity");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\Asus\\Desktop\\software testing class\\seleniumScreenshort\\option1.png");
		 FileHandler.copy(src, dest);
	}

}
