package interfac;

 interface L
{
     void test1();
     void test2();
}
 class J implements L
 {
	 public void test1()
	 {
		 System.out.println("test1() overridden in class B");
	 }
	 public void test2 ()
	 {
		 System.out.println("test2() overridden in class B");
	 }
 }
	 class AC
	 {
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		J b= new J();
		b.test1();
		b.test2();
		System.out.println("Main End");

	}

   }
 
