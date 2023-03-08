package typecasting;

public class D 
{
    static void test(int a)
    {
    	System.out.println("test(int a):"+a);
    }
	public static void main(String[] args)
	{
		test((int)90.5);
		System.out.println("done");  // explicit narrowing 

	}

}
