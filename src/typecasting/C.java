package typecasting;

 class C 
 {
    static void test(double d)
    {
    	System.out.println("test(double):"+d);
    }
	public static void main(String[] args)
	{
		test(90);// Auto widening when method invocation
		System.out.println("Done");

	}

}
