package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadallDatatype {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		  FileInputStream myfile=new FileInputStream("D:\\excel\\Book2.xlsx");
		  Sheet MySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		  for(int i=0;i<=4;i++)
		  {
			  for(int j=0;j<=2;j++)
			  {
				 Cell myCell = MySheet.getRow(i).getCell(j);
				 CellType myCellType = myCell.getCellType();
				 
				 if(myCellType==CellType.NUMERIC)
				 {
					 double value = myCell.getNumericCellValue();
					 System.out.print(value+" ");
				 }else if(myCellType==CellType.BOOLEAN)
				 {
					 boolean value = myCell.getBooleanCellValue();
					 System.out.print(value+" ");
				 }else if(myCellType==CellType.STRING)
				 {
					 String value = myCell.getStringCellValue();
					 System.out.print(value+" ");
				 }
			  }
			  System.out.println();
		  }
		  
		  
	}

}
