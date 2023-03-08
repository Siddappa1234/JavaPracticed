package interfac;
interface ExampleA
  
 {
      int i=0;//global variable will be initialized to 0
 } 
     class UV implements ExampleA{
    	static void test(UV d1)
         {
    		
        	 System.out.println("The value of i is:"+UV.i);
         } 
     }
     class DA extends UV
     {
    	 
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		UV.test(new UV());
		System.out.println("Main Ends");// call by reference 

	}

}
