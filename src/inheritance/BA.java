package inheritance;

 class AS
 {
        void test1()
        {
        	System.out.println("From test1() of class A");
        }
 }      
 class XD extends AS
 {
	 void test2()
	 {
		 System.out.println("From test2() of class B");
	 }
 }
 class AF extends XD
 {
	 void test3()
	 {
		 System.out.println("From test3() of class");
	 }
 }
 class BA
 {
	public static void main(String[] args) 
	{
		XD d1= new XD();
		AF AF1= new AF();
		d1.test1();
		d1.test2();
		//d1.test3();
		System.out.println("------");
		AF1.test1();
		AF1.test2();

	}

 }
 
 
