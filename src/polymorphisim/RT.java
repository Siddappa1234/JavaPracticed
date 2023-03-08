package polymorphisim;

 class P 
 {
    void test()
    {
    	System.out.println("Class A implementation");
    }
 }
  class O extends P
  {
	  void test()
	  {
		  System.out.println("Class B implementation");
	  }
  }
  class I extends P
  {
	  void test()
	  {
		  System.out.println("Class C implemenatation");
	  }
  }
  class RT
  {
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		P P1= new P();
		P1.test();
		System.out.println("-------------");
		P1= new O();
		P1.test();
		System.out.println("-------");
		P1= new I();
		P1.test();
		System.out.println("------");
		

	}

}
