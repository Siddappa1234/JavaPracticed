package typecasting;

 class FH
{
    void test1()
    {
    	System.out.println("Running test1 method");
    }
}
 class GJ extends FH
 {
	 void test2()
	 {
		 System.out.println("Running test2 method");
	 }
 }
  class FG 
  {
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		 FH f1= (FH) new GJ();//upcasting 
		 f1.test1();
		// f1.test2();  // cannot access sub class features

	}

}

