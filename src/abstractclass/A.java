package abstractclass;

abstract class Z
{
    abstract void test1(int a);
    abstract void test2();
}
     class B extends Z
     {
    	 void test1(int a)
    	 {
    		 System.out.println("test1(int a)overridden in class B");
    	 }
    	 void test2()
    	 {
    		 System.out.println("test2()overridden in class B");
    	 }
     }
    	 class A
    	 {
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		B b1= new B();
		b1.test1(900);
		b1.test2();
		System.out.println("Main ends");

	}

}
     
