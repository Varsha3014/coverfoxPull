package mockAssigenment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(2000);
		WebElement yesButton = driver.findElement(By.xpath("//label[text()='Yes']"));
		WebElement impressiveButton = driver.findElement(By.xpath("//label[text()='Impressive']"));
		Thread.sleep(1000);
		//yesButton.click(); // selecting yes button
		System.out.println(yesButton.isSelected());
		if (yesButton.isSelected()) 
		{
			System.out.println("yes button is already selected");
		} 
		else
		{
			impressiveButton.click();
			System.out.println("impressiveButton is selected");

		}

	}

}
