package exceptionhandling;

public class Tester2 {

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		int a=10, b=0;
		try
		{
			int res=a/b;
			System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught");
		}
		System.out.println("Main Ends");
	}

}
