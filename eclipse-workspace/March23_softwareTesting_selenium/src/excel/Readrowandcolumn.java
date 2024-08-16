package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readrowandcolumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile=new FileInputStream("C:\\selenium\\excel1\\Book1.xlsx");
		Sheet Mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		//read whole cell
		for(int i=0;i<=2;i++)
		{
			String value = Mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
        System.out.println();
        System.out.println("=====================================");
        //read whole row
        for(int i=0;i<=3;i++)
        {
        	String value1 = Mysheet.getRow(i).getCell(0).getStringCellValue();
        	System.out.print(value1+" ");
        }
        System.out.println();
	}

}
