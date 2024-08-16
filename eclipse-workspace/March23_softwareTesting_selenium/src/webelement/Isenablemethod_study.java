package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenablemethod_study {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(2000);
	//boolean result = driver.findElement(By.xpath("//button[text()='GetOTP']")).isEnabled();
	
	    	driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
		WebElement mobilenumberfield = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		mobilenumberfield.sendKeys("9999999999");
		//code optimism
		WebElement ButtonGetotp = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	     boolean result = ButtonGetotp.isEnabled();
	    ButtonGetotp.click();
	    System.out.println(result);	
	    		
	}

}

