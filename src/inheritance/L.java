package inheritance;

 class CM // super calling statement 
 {
   CM()
   {
	   System.out.println("Running C class constructor");
   }
 }
   class DN extends CM
   {
	   DN()
	   {
	   super();
	   
		   System.out.println("Running D class constructor");
    }
   
	   }
	   class EB extends DN
	   {
		   EB()
		   {
		   super();
		   
			   System.out.println("Running E class constructor");
		   
	   }
	   }
	   
		   class L
		   {  
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		EB rv= new EB();
		System.out.println(" Main Ends ");

	}
		   
		   }	   	   
	   

   
 
	   
   
