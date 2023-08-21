package excellsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadSheetAutoSize {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		FileInputStream myFile=new FileInputStream("D:\\18thFebVelo.xlsx");
	
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("sheet1");
		
		
		// get Row and cell count
		
		int lastRowNum = mysheet.getLastRowNum();
		
	   // System.out.println(lastRowNum);
		
		int totalRowNum=lastRowNum;
		
		short lastCellNum = mysheet.getRow(0).getLastCellNum();
		
		System.out.println(lastCellNum);
		
		
		int totalCellNum=lastCellNum-1;
		
		for(int i=0;i<=totalRowNum;i++) 
		{
			
			for(int j=0;j<=totalCellNum;j++) 
			{
				
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(value+" ");
				
			}
			System.out.println();
			
		}
	}

}
