package exceptionstudy;

public class UseOfFinally {

	public static void main(String[] args)
	{

    int a=10;
    int b=20;
   try 
       {
		int div=a/b;
		System.out.println(div);
       } 
   finally 
   {
	System.out.println("Finally print this");
   }
   
   System.out.println("hi good");
	}
	//catchArithmeticException e)
	//{
	//	System.out.println("Divide by zero is not possible");
	//}
}
