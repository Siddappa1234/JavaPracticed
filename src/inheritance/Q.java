package inheritance;

 class WM
 {
    int a=10;
    void test1()
    {
    	System.out.println("Running test1 method");
    }
 }
    class WN extends WM
    {
    	int b=20;
    	void test2()
    	{
    		System.out.println("Running test2 method");
    	}
    }
    class Q
    {
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		WN WN1= new WN();
		WN1.test1();
		WN1.test2();
		System.out.println("Value a is"+WN1.a);
		System.out.println("Value of b is"+WN1.b);
		System.out.println("Main starts");

	}

     
    }
 
