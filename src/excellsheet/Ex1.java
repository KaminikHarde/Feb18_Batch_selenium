package excellsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

		//create object of fileinputStream class
		
		FileInputStream myFile=new FileInputStream("D:\\18thFebVelo.xlsx");
		
		//create object of WorkBookFactory
		
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
			
		System.out.println(value);
		
		
	//String value1 = WorkbookFactory.create(myFile).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
	
	//	System.out.println(value1);
		
	//	double value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		
	//	System.out.println(value2);
		
	//	boolean value3 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
		
		//System.out.println(value3);
		
		
	}
}
