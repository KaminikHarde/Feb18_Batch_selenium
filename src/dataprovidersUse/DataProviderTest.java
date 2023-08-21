package dataprovidersUse;

import org.testng.annotations.DataProvider;

public class DataProviderTest 
{
	@DataProvider(name="myFBdata")
public static String[][] testData() 
{
	String data[][]= {{"Kamini","Harde","9876543908"},{"Sagar","Nikam","9970203035"},{"Amol","Harde","7218701020"}};
    return data;


}
	
	
}
