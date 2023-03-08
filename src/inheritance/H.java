package inheritance;

 class FA
{
  FA()
  {
	  System.out.println("From E()");
  }
}
  class FB extends FA
  {
	  FB(int a)
	  {
		  System.out.println("From D(int a)");
	  }
	  FB()
	  {
		  this(10);
		  System.out.println("From F()");
	  }
  }
  class GC extends FB
  {
	  GC()
	  {
		  System.out.println("From G()");
	  }
  }
  class H{
	  
  
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		GC g1= new GC();
		System.out.println(" Main Ends");

	}

 }
