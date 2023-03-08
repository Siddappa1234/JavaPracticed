package nonstaticmethods;

 class B {
	 void test1()
	 {
		 System.out.println("Runnin of test1 method");
	 }
	 void test2()
	 {
		 System.out.println("Running of test2 method");
	 }

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
        B b= new B();
        b.test1();
        b.test2();
        System.out.println("Main Ends");
	}

}
