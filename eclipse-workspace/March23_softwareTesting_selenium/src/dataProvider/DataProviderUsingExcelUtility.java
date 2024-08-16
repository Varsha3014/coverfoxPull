package dataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProviderUsingExcelUtility
{
	
	@DataProvider(name ="FamilyMember")
	public String[][] mydata() throws EncryptedDocumentException, IOException
	{
		String testdata[][]=readDataFromExcel("ExcelData","Sheet1");
		return testdata;
		
	}
	public static String[][] readDataFromExcel(String  ExcelFileName,String SheetName) throws EncryptedDocumentException, IOException
	{
		String path = System.getProperty("user.dir")+"\\"+ExcelFileName+".xlsx";
		FileInputStream myFile=new FileInputStream(path);
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet(SheetName);
		int rowCount = mySheet.getLastRowNum();
		int cellCount = mySheet.getRow(0).getLastCellNum()-1;		
		System.out.println(rowCount);
		System.out.println(cellCount);
		String data[][]=new String[rowCount+1][cellCount+1];
		for(int i=0;i<=rowCount;i++)
		{
			for(int j=0;j<=cellCount;j++)
			{
				String value=mySheet.getRow(i).getCell(j).getStringCellValue();
				data[i][j]=value;
			}
		}
		return data;
		
	}
	

}
