package nonstaticmethods;

 class A {
	 
		 void test1()
		 {
			 System.out.println("Running test1 method");
		 }
	 

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		A rv= new A();
		rv.test1();
		System.out.println("Main Ends");

	}

}
