package dropdown_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement mutiselect = driver.findElement(By.name("cars"));
		Select smulti=new Select(mutiselect);
		smulti.selectByValue("volvo");
		WebElement mutiselect1 = driver.findElement(By.id("cars"));
		Select smulti1=new Select(mutiselect1);
		smulti1.selectByValue("audi");
		System.out.println(smulti.isMultiple());

		
		
	}

}
