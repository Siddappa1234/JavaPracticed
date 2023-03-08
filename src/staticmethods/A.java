package staticmethods;

 class A 
 {
     static int a=10;
     static void test()
     {
    	 System.out.println("test method");
     }
     
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		A.test();
		System.out.println("The value of a is:"+A.a);
		

	}

}
