package exceptionhandling;

public class Tester4 {

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		try
		{
			int a=10/0;
			int b=Integer.parseInt("Harugeri");
		}
		catch(ArithmeticException e)
		{
			System.out.println("1 st catch Block");
		}
		catch(NumberFormatException e)
		{
			System.out.println("2 nd catch Block");
		}
         System.out.println("Main Ends ");
	}

}
