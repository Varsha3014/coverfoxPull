package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readwholedata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream("C:\\selenium\\excel1\\Book1.xlsx");
        Sheet MySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
        for (int i = 0; i <= 3; i++) 
        {
        	for (int j = 0; j <= 2; j++) {
        	String value = MySheet.getRow(i).getCell(j).getStringCellValue();
        	System.out.print(value + " ");
        	}
        	System.out.println();
         } 
       
}
	}
