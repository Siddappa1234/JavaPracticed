package typecasting;

class RA 
{
     void test1()
     {
    	 System.out.println("Running test1 method");
     }
}
 class Y extends RA
 {
	 void test2()
	 {
		 System.out.println("Running test2 method");
	 }
 }
 class RX
 {
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		RA x1= new Y();//upcasting 
		Y y1=(Y) x1;// Explicit downcasting
		System.out.println("Main Ends ");

	}

}
