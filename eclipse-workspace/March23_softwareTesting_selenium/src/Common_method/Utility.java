package Common_method;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
public class Utility {
     // excelData
		// screenSHot
		// click
		// scroll
		// wait-->implicit
	
	//1.Scroll
	public static void scrollIntoView(WebDriver driver, WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}
   //2.click
	public static void Clickon(WebDriver driver,WebElement element)
	{
	    scrollIntoView(driver, element);
	    element.click();
		
	}
	//3.ScreenShot
	public static void TakeScreenShot(WebDriver driver,String filename) throws IOException
	{
		File sre = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Asus\\Desktop\\software testing class\\seleniumScreenshort"+filename+".png");
		FileHandler.copy(sre, dest);  
		
	}
	public static String ExcetDataRead(String filepath,String Sheetnum,int Rownum,int Colnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream(filepath);
		String value = WorkbookFactory.create(myfile).getSheet(Sheetnum).getRow(Rownum).getCell(Colnum).getStringCellValue();
	    return(value+" ");
	}
	 public static String readDataFromProertyFile(String Key) throws IOException
	    {
		 String filePath = System.getProperty("user.dir")+"//CoverData.properties";
		 FileInputStream myfile=new FileInputStream(filePath);	
		 Properties prop=new Properties();
	    	prop.load(myfile);
	    	String value = prop.getProperty(Key);
	    	Reporter.log("Reading data from Property file",true);
	    	return value;
	    }
	
	}
   

