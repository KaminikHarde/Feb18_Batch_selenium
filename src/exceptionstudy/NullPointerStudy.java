package exceptionstudy;

public class NullPointerStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		
         String a="abc";
		 String b=null;
		 
		Thread.sleep(10);
		
		try 
		{
		
			//System.out.println(a.charAt(10));//risky code
			
			//System.out.println(10/0);
		} 
		catch (NullPointerException e)
		{
			
			System.out.println("check String,string should not be null");
			//e.printStackTrace();
		}
		catch (Exception e) 	
			{
				System.out.println("There some exception plz check");
			}
			System.out.println("Hi GM");
		}
	}


