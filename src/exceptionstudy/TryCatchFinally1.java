package exceptionstudy;

public class TryCatchFinally1 {

	public static void main(String[] args) 
	{

		String s="Testing";
		 
		try 
		{
			System.out.println(s.length());
		} 
		catch (NullPointerException e) 
		{

        System.out.println("Please check String value,should not be null");
		}
		finally
		{
		System.out.println("Good Evening");	
		}
	}

}
