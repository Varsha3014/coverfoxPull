package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args)
    {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
       //How many rows are there
      List<WebElement> numofrows = driver.findElements(By.xpath("//table[@name='courses']//tr"));
       int totalnumofrows = numofrows.size();
       System.out.println(totalnumofrows);
    
      //How many columns are there
        List<WebElement> numofcolumns = driver.findElements(By.xpath("//table[@name='courses']//tr[1]/th"));
       int totalnoofcol=numofcolumns.size();
       System.out.println(totalnoofcol);
       //How to read Particular data from table
     String mytext = driver.findElement(By.xpath("//table[@name='courses']//tr[3]/td[2]")).getText();
       System.out.println(mytext);
       
       for(int i=1;i<=3;i++)//1---3
       {
       WebElement element =

       driver.findElement(By.xpath("//table[@name='courses']//tr[5]/td["+i+"]"));

       String text = element.getText();
       System.out.println(text);
       
       
    }

}}
