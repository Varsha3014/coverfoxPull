package dropdown_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//1.Identify list box to be handled and store it in reference variable
		WebElement dropdown = driver.findElement(By.cssSelector("select#dropdown-class-example"));
         Thread.sleep(2000);
         Select s=new Select(dropdown);
       //3.By using one of the select class methods we can select values form list box like
        // s.selectByIndex(3);  //using selectbyindex method select option3
        // s.selectByValue("option3");  //using selectbyvalue metod select option 3
	    s.selectByVisibleText("Option3");  // using select by visible text method
         
	}

}
