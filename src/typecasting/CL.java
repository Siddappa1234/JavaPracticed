package typecasting;

abstract class CK 
{
  abstract void test1();
  {
	  
  }
}
  class N extends CK
  {
	  void test1()
	  {
		  System.out.println("test overridden in class N");
	  }
  }
  class CL
  {
	public static void main(String[] args) 
	{   
		System.out.println("Main Starts");
		CK m1= new N();//(creating concrete class )
		m1.test1();
		System.out.println("Main Ends");

	}

}
