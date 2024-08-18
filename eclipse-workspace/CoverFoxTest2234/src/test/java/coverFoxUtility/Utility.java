package coverFoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility
{
	
	public static void TakeScreenShot(WebDriver driver,String filename) throws IOException
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Reporter.log("taking screenShot", true);
		String timeStamp= new  SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

		File dest = new File(System.getProperty("user.dir") + "\\Screenshot\\" +

		filename +timeStamp+ ".png");

		FileHandler.copy(src, dest);
		Reporter.log("saving file at location "+dest, true);
	 }
	
  public static String ExcetDataRead(String filepath,String Sheetnum,int Rownum,int Colnum) throws EncryptedDocumentException, IOException
    {
		FileInputStream myfile=new FileInputStream(filepath);
		String value = WorkbookFactory.create(myfile).getSheet(Sheetnum).getRow(Rownum).getCell(Colnum).getStringCellValue();
	    return(value+" ");
	}
	 public static String readDataFromProertyFile(String Key) throws IOException
	    {
	    	FileInputStream myfile=new FileInputStream(System.getProperty("user.dir")+"//CoverFoxData.properties");
	    	Properties prop=new Properties();
	    	prop.load(myfile);
	    	Reporter.log("reading data from property file "+Key, true);
	    	String value = prop.getProperty(Key);
	    	return value;
	    }

}
