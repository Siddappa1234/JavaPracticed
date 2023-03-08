package constructor;

 class Sample3 
 {
	// this calling 
      Sample3()
      {
    	  System.out.println("Running Sample3()");
      }
      Sample3(int a)
      {
    	 this();
    	  System.out.println("Running Sample3(int a)");
      }
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Sample3 rv= new Sample3(90);
		System.out.println("Main starts");

	}

}
