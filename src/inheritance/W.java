package inheritance;

 class WV 
 {
     WV()// (super by default complier called 
     {
    	 System.out.println("Running D class constructor");
     }
 }
     class EA extends WV
     {
    	 EA()
    	 {
    		 System.out.println("Running E class constructor");
    	 }
     }
     class W
     {
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		EA e1= new EA();
		System.out.println("Main Ends ");

	}
	
     
 }


