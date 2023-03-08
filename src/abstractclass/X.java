package abstractclass;

abstract class V
{
      abstract void test1();
      void test2()
      {
    	  System.out.println("test2() of abstract class");
      }
}
      class Y extends V
      {
    	  void test1()
    	  {
    		  System.out.println("test 1() overridden in class DA ");
    	  }
      }
      class X
      {
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Y y1=new Y();
		y1.test1();
		y1.test2();
		System.out.println("Main Ends");

	}


}
