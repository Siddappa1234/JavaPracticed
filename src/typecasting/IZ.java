package typecasting;

 class I1 
 {
     void test1()
     {
    	 System.out.println("Running test1 method");
     }
 }
 class JX extends I1
 {
	 void test2()
	 {
		 System.out.println("Running test2 method");
	 }
 }
 class IZ
 {
 
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		I1 Z1 = new I1();
		JX j1= (JX) Z1;
		j1.test1();
		j1.test2();
		System.out.println("Main Ends");
		

	}

}
 
