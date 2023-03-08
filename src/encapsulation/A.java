package encapsulation;

 class A
 {
   private int a;
   A(int a)
   {
	   this.a=a;
   }
   public int getA()
   {
	   return a;
   }
   public void setA(int a)
   {
	   this.a=a;
   }
   public class Tester
   {
   
	public static void main(String[] args) 
	{
		A a1= new A(10);
		//a1.a;  //private members cannot be accessed outside the package 
		System.out.println("Value of a is"+a1.getA());
		//a1.a=100 // cannot assign the private variable
		a1.setA(100);
		System.out.println("value of a is"+a1.getA());

	}

}
}