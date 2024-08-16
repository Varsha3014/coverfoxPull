package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TogetRowdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("C:\\selenium\\excel1\\Book1.xlsx");
		Workbook workbook = WorkbookFactory.create(myfile);
		Sheet mysheet = workbook.getSheet("Sheet1");
	       Row myrow = mysheet.getRow(0);
	      Cell mycell = myrow.getCell(0);
	      CellType type = mycell.getCellType();
	      System.out.println(type);
	}

}
