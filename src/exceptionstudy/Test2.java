package exceptionstudy;

public class Test2 {

	public static void main(String[] args) 
	{

		String a=null;
		try
		{
			System.out.println(a.charAt(20));
			
		} 
		catch (StringIndexOutOfBoundsException e) 
		{
			
			System.out.println("please insert value inbetween 0-7");
			
		}
		
		catch (NullPointerException e) 
		{
		System.out.println("please check string object----->it is may be null ");
		}
		catch (Exception e) 
		{
			System.out.println("Something went wrong");
		}
		System.out.println("Hi i have done task");
	}

}
