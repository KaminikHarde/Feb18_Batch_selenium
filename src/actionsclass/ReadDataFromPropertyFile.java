package actionsclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException 
	{
		//1.create object of properties
		Properties prop=new Properties();
		
		//2.create object of FileInputStram
		
		FileInputStream myFile=new FileInputStream("C:\\Users\\si\\eclipse-workspace\\Feb18_Batch_selenium\\myproperty.properties");
		
		//3.load property file
		
		prop.load(myFile);
		
		//4.get the property by calling key
		System.out.println(prop.get("url"));
		System.out.println(prop.get("mobNum"));
	}

}
