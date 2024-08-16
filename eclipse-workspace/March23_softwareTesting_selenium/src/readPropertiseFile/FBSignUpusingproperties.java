package readPropertiseFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBSignUpusingproperties
{
	@Test
	public void data() throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		String url = UtilityMethodforProperties.readDataFromProertyFile("url");
		driver.get(url);
		driver.findElement(By.name("firstname")).sendKeys(UtilityMethodforProperties.readDataFromProertyFile("firstName"));
		driver.findElement(By.name("lastname")).sendKeys(UtilityMethodforProperties.readDataFromProertyFile("lastName"));
		driver.findElement(By.name("reg_email__")).sendKeys(UtilityMethodforProperties.readDataFromProertyFile("mobNum"));
		Thread.sleep(2000);
		driver.close();
	}

}
