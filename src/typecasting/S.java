package typecasting;

 class S 
 {
    void test1()
    {
    	System.out.println("Test1 method of super class");
    }
  class T extends S
  {
	  void test1()
	  {
		  System.out.println("Test1 method overridden in sub class ");
	  }
	  void test2()
	  {
		  System.out.println("test2 method of subclass ");
	  }
  }   
  class Tester
  {
	public static void main(String[] args) 
	{
		S s1= new S();// Auto -upcasting
		s1.test1();
		//s1.test2();//CTE [subclass features cannot be accessed]
        
	}

 }
 }
