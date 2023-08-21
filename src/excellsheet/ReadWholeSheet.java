package excellsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWholeSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		// create object of FileInputStreamclass
		
		FileInputStream myFile=new FileInputStream("D:\\18thFebVelo.xlsx");

		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("sheet1");
		
		//outer for loop -->0-->1
		for(int i=0;i<=1;i++)
		{
		//inner for loop-->columns/cell 0-->2	
			
			for(int j=0;j<=2;j++) 
			{
				
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(value+" ");	
			}
			System.out.println();
			
		}
		
		
		
	}

}
