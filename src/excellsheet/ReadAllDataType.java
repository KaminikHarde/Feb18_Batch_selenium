package excellsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllDataType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		// create an object of File Input stream
		
		FileInputStream myFile=new FileInputStream("D:\\18thFebVelo.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("sheet1");

	int totalRows = mysheet.getLastRowNum();
		
		int totalCells = mysheet.getRow(0).getLastCellNum()-1;
		
		//outer for loop--->
		
		for(int i=0;i<=totalRows;i++) 
		{
		
		for(int j=0;j<=totalCells;j++) 
		{
			
		Cell mycell = mysheet.getRow(i).getCell(j);	
			
			CellType myCellType = mycell.getCellType();
			
			if(myCellType==CellType.STRING) 
			{
				
				System.out.print(mycell.getStringCellValue()+" ");		
			}
			else if(myCellType==CellType.NUMERIC) 
			{
				System.out.print(mycell.getNumericCellValue()+" ");
			}
			else if(myCellType==CellType.BOOLEAN) 
			
			{
				System.out.print(mycell.getBooleanCellValue()+" ");
			}
			
			else if(myCellType==CellType.BLANK) 
			{
				System.out.print(" ");
			}		
		    }	
		
		           System.out.println();	
			
		    }

	       }

          }
