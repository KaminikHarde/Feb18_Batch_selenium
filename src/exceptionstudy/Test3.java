package exceptionstudy;

public class Test3 {

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		
		try 
		{
			System.out.println(b/a);
		}
		finally 
		{

            System.out.println("This is the finally block");
		}
         
		System.out.println("Hi all");
	}

}
