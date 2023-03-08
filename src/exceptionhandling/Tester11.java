package exceptionhandling;

public class Tester11 {

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		try
		{
			int[]arr= new int[9999];
		}
		catch(OutOfMemoryError e)
		{
			System.out.println("caught");
		}
		System.out.println("Done");

	}

}
