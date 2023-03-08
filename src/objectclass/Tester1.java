package objectclass;
class A {
	
}
public class Tester1
{

	public static void main(String[] args) 
	{
		A rv1= new A();
		System.out.println(rv1.toString());
		A rv2= new A();
		System.out.println(rv2.toString());
		A rv3= new A();
		A rv4=rv3;
		System.out.println(rv3.toString());
		System.out.println(rv4.toString());

	}

}
