package methodoveriding;

class BL 
{
      final void test1()
      {
    	  System.out.println();
      }
}
      class KL extends BL
      {
    	  void test1();//we cannot override final method 
    	  {
    		  System.out.println("Sub class implemenation");
    	  }
      }
  
      class BP
      {
    	  
      
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		KL rv= new KL();
		rv.test1();
	}

}

