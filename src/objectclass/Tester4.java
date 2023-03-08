package objectclass;
class C
{
	
}
public class Tester4 
{

	public static void main(String[] args)
	{
		C rv1= new C();
		System.out.println(rv1.hashCode());
		C rv2= new C();
		System.out.println(rv2.hashCode());
         System.out.println(rv2.hashCode());
         System.out.println("--------");
         C rv3= new C();
         C rv4= rv3;
         System.out.println(rv3.hashCode());
         System.out.println(rv4.hashCode());
	}

}
