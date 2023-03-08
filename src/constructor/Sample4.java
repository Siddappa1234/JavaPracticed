package constructor;

 class Sample4 
 {
      Sample4()
      {
    	 // this();
    	  System.out.println("Sample4()");
      }
      Sample4(int a)
      {
    	  this();
    	  System.out.println("Sample4(double)");
      }
      Sample4(double d)
      {
    	  this(10);
    	  System.out.println("Sample4(int a,double d)");
      }
      Sample4(int a, double d)
      {
    	  this(10.5);
    	  System.out.println("Sample4(double d,int a)");
      }
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Sample4 rv= new Sample4(10,10.5);
		System.out.println("Main Ends");

	}

}
