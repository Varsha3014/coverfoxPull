package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Example1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{
	      FileInputStream Myfile= new FileInputStream("C:\\selenium\\excel1\\Book1.xlsx");
        String Mystring = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	    System.out.println(Mystring);
	
	}

}
