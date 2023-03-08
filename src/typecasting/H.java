package typecasting;

class H 
{
    void test1()
    {
    	System.out.println("Running test1 method");
    }
}
 class I extends H
 {
	 void test2()
	 {
		 System.out.println("Running test2 method");
	 }
 }
 class J extends I
 {
	 void test3()
	 {
		 System.out.println("Running test3 method");
	 }
 }
 class Tester
 {
	public static void main(String[] args) 
	{
		System.out.println("Level 1 upcasting");
		I i1= new J();// Auto upcasting
		i1.test1();
		i1.test2();
		System.out.println("Level 2 upcasting");
		H h1= new J();// Auto upcasting
		h1.test1();
		//h1.test2();
		
		

	}

}
