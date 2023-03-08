package methodoverloading;

class Demo 
{
     static void test()
     {
    	 System.out.println("Running test()");
     }
     static void test(int a)
     {
    	 System.out.println("Running test(int a)");
     }
     static void test(double d)
     {
    	 System.out.println("Running test(double d)");
     }
     static void test(int a ,double d)
     {
    	 System.out.println("Running test(int a, double d)");
     }
     static void test(double d, int a)
     {
    	 System.out.println("Running test(double d, int a)");
     }
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		test();
		test(90);
		test(90.5);
		test(90,90.5);
		test(90.5,90);
		System.out.println("Main ends");

	}

}
