package objectclass;
class E
{
	public boolean equals(Object obj)//overridden
	{
		return true;
	}
}

public class Tester5 {

	public static void main(String[] args) 
	{
		E rv1= new E();
		E rv2= new E();
		System.out.println(rv1==rv2);
		System.out.println(rv1.equals(rv2));

	}

}
