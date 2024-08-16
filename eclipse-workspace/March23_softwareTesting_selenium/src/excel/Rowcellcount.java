package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Rowcellcount {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("D:\\excel\\Book1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		int lastrownum=mySheet.getLastRowNum();
		System.out.println(lastrownum);
		int totalnumofrows=lastrownum;
		short lastCellnum = mySheet.getRow(0).getLastCellNum();
		System.out.println(lastrownum);
		int totalnumofcolumns=lastrownum-1;
		for(int i=0;i<=totalnumofrows;i++)
		{
			for(int j=0;j<=totalnumofcolumns;j++)
			{
				Cell mycell = mySheet.getRow(i).getCell(j);
				  CellType cellType = mycell.getCellType();
				  if(cellType==CellType.NUMERIC)
				  {
					  System.out.print(mycell.getNumericCellValue()+" ");
				  }else if(cellType==CellType.BOOLEAN)
				  {
					  System.out.print(mycell.getBooleanCellValue()+" ");
				  }else if(cellType==CellType.STRING)
				  {
					  System.out.print(mycell.getStringCellValue()+" ");
				  }
			}
			System.out.println();
		}
	}

}
