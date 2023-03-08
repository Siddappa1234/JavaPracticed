package exceptionhandling;

public class Tester8 
{
     static void test() throws ClassNotFoundException
     {
    	 class.forName("Pack5.mobile");
     }
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println("Main Starts");
		test();
		System.out.println("Main Ends");

	}

}
