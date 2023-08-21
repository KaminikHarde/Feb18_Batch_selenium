package excellsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellReadRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		FileInputStream myFile=new FileInputStream("D:\\18thFebVelo.xlsx");

		
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("sheet1");
		
		// read whole row
		
		for(int i=0;i<=2;i++)
		{
			
			String value = mysheet.getRow(0).getCell(i).getStringCellValue();
			
			System.out.print(value+" ");
		}
		System.out.println();
		
		
		//read whole column
		
		for(int i=0;i<=3;i++) 
		{
			
			String value = mysheet.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(value);
		}
	}

}
