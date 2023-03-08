package localvariable;

 class A 
 {
     static void test()
     {
    	 int a=10;
    	 System.out.println("Value of a is:"+a);
     }
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		A.test();
		System.out.println("Main Ends");

	}

}
