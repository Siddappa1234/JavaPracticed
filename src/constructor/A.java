package constructor;

 class A {
	 A()
	 {
		 System.out.println("Running constructor");
	 }
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		A rv=new A();
		A rv1= new A();
		System.out.println("Main Ends");

	}

}
