package nonstaticmethods;

 class C 
 {
      int a=10;
      void test()
      {
    	  System.out.println("Running of test1 method");
      }
	public static void main(String[] args) 
	{
		System.out.println(" Main starts");
		C c= new C();
		c.test();
		System.out.println("The Result of a is:"+c.a);

	}

}
