package ChromeOpetionsUse;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Allopetions_in_one {

	public static void main(String[] args) throws InterruptedException
	{
      ChromeOptions option=new ChromeOptions();
      ArrayList<String> al=new ArrayList<String>();
      al.add("disable-notifications");
      al.add("start-maximized");
      //al.add("incognito");
      option.addArguments(al);
      WebDriver driver=new ChromeDriver(option);
      driver.get("https://www.justdial.com/");
      Thread.sleep(2000);
      


	}

}
