package exceptionhandling;

public class Tester6 {

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		try
		{
			//class.forName("Pack5.Mobile");
			System.out.println("Hi");
			
		}
				catch(classNotfoundException e)
				{
					System.out.println("Caught!");
				}
				System.out.println("Main Ends ");
			
		}

}


