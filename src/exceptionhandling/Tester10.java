package exceptionhandling;

public class Tester10 
{
     static void test1() throws ClassNotFoundException
     {
    	 class.forName("Pack5.model");
     }
     static void test2() throws ClassNotFoundException
     {
    	 test1();
     }
     static void test3() throws ClassNotFoundException
     {
    	 test2();
     }
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println("Main starts");
        test3();
        System.out.println("Main Ends");
	}

}
