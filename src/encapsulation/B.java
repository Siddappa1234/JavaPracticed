package encapsulation;

 class B 
 {
    static B b1;// b1 is global static reference variable
    int empID=90;
    static void test()
    {
    	System.out.println("From test:"+b1.empID);
    }
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		b1= new B();
		System.out.println("From Main:"+b1.empID);
		test();
		System.out.println("Main Ends");

	}

}
