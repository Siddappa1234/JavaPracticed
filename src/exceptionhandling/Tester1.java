package exceptionhandling;

public class Tester1 
{

	public static void main(String[] args) 
	{
		System.out.println(" Main starts");
		try
		{
			int a=Integer.parseInt("Mumbai");
		}	
			catch(NumberFormatException e)
			{
				System.out.println("Caught!");
			}
		   System.out.println("Main Ends");
		}

	}


