package objectclass;
class D
{
	String j;
	D(String j)
	{
		this.j=j;
	}
	@Override
	public String toString()
	{
		System.out.println("The value of j is"+j);
		return j;
	}
}
public class Tester3 
{

	public static void main(String[] args)
	{
		D rv1= new D("Laptop");
		System.out.println(rv1);
		D rv2= new D("Mobile");
		System.out.println(rv2);

	}

}
