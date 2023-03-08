package typecasting;

class Father // method overiding 
{
     void smoking ()
     {
    	 System.out.println("Normal smoker");
     }
}
     class Son extends Father 
     {
    	 void smoking()
    	 {
    		 System.out.println("Chain smoker");
    	 }
     
     
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Father f1= new Son();
		f1.smoking();
		System.out.println("Main Ends");

	}

}
