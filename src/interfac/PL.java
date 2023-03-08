package interfac;

interface Y // multiple inheritance is not possible in java concept
{
   void test1();
}
 interface FS
 {
	 void test2();
 }
 class EZ implements FS,Y
 {
	 public void test1()
	 {
		 System.out.println("test1 overridden in class E");
	 }
	 public void test2()
	 {
		 System.out.println("test2 implementation in class E");
	 }
	 class PL
	 {
	public static void main(String[] args) 
	{
	   System.out.println("Main starts");
	   EZ ez1= new EZ();
	   ez1.test1();
	   ez1.test2();
	   System.out.println("Main Ends ");

	}

}
 }
