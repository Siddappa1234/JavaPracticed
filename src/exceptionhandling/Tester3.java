package exceptionhandling;

public class Tester3 {

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		int []arr= {10,20};
		try
		{
			System.out.println(arr[0]);
			//if we entered arr[90] then we ll get exception msg
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught");
		}
		finally
		{
			System.out.println("Exception finally block");
		}
          System.out.println("Done!!");
	}

}
