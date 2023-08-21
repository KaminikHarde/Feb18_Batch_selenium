package excellsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  
	{

		FileInputStream myFile=new FileInputStream("D:\\18thFebVelo.xlsx");

		Workbook myWorkBook = WorkbookFactory.create(myFile);
		
		Sheet mysheet = myWorkBook.getSheet("sheet1");
		
		Row myRow = mysheet.getRow(1);
		
		Cell myCell = myRow.getCell(1);
		
		CellType myCellType = myCell.getCellType();
		
		System.out.println("Data type is "+myCellType);
		
		System.out.println(myCell.getNumericCellValue());
	}

}
