package exceptionstudy;

public class TryCatchFinally {

	public static void main(String[] args) 
	{
		String a="abc";
		try
		{
			System.out.println(a.charAt(10));//risky code
			
		} 
		catch (NullPointerException e)
		{
       
			System.out.println("check index,index should in betn o-2");

		}
       
		finally 
		{
			System.out.println("Finally block is running");
		}
	}

}
