package methodoverloading;

class Sample1 
{
     static void test(int a)
     {
    	 System.out.println("Running test(int a)");
     }
     void test(double d)
     {
    	 System.out.println("Running test(double d)");
     }
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		test(10);
		Sample1 s= new Sample1();
		s.test(10.5);

	}

}
