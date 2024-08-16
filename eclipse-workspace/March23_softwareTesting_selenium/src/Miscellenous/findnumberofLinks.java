package Miscellenous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findnumberofLinks {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    Thread.sleep(1000);
	    List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
	    //print how many links are there
	    System.out.println(totalLinks.size());
	    //print all link text
	    //1
	   //(int i=0;i<=totalLinks.size()-1;i++)
	   // {
	     //  System.out.println(totalLinks.get(i).getText());
	    //}
	   //2.using foreach
	  //  for(WebElement t:totalLinks)
	   // {
	    	//System.out.println(t.getText());
	  //  }
	  //3.by using iterator
	    Iterator<WebElement> it = totalLinks.iterator();
	    while(it.hasNext())
	    {
	    	String weblist = it.next().getText();
	    	System.out.println(weblist);
	    }
	
	}

}

