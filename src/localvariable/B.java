package localvariable;

 class B 
 {
     static void test()
     {
    	 int a=10;
    	 System.out.println("value of a is"+a);
     }
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		B.test();
		int a=90;
		System.out.println("value of a is"+a);

	}

}
