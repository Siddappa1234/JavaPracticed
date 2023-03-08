package methodoveriding;

 final class WZ 
{
	void test1()
	{
		System.out.println("test1() of super class");
	}
    void test2()
    {
    	System.out.println("test2() of super class");
    }
}
    class F extends WZ// Final classes cannot be inherited 
    {
    
    }
    class QZ 
    {
    	
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		System.out.println("Main ends");

	}

}

