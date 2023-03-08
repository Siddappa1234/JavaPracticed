package nonstaticmethods;

 class Sample {
	 static int a=10;
	        int b=20;
	 static void test1()
	 {
		 System.out.println("Running test1 method");
	 }
     void test2()
     {
    	 System.out.println("Running test2 method");
     }
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Sample.test1();
		Sample s= new Sample();
		s.test2();
		System.out.println("The value of a is:"+Sample.a);
		System.out.println("The value of b is:"+s.b);

	}

}
