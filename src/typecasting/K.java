package typecasting;

 interface K
 {
    void test1();
      	
  }
 class L implements K
 {
	 public void test1()
	 {
		 System.out.println("test1 overridden in class L");
	 }
	 public void test2()
	 {
		 System.out.println("test2 of class L");
	 }
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		K k1= new L();
		k1.test1();
		System.out.println("Main Ends");
		

	}

}
