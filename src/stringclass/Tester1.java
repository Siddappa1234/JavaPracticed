package stringclass;

public class Tester1 
{
	public static void main(String[] args) 
	{
		String rv1= new String("Hello");
		String rv2= new String("Hello");
		System.out.println(rv1);
		System.out.println(rv2);
		System.out.println("-----------");
		System.out.println(rv1.equals(rv2));
		System.out.println(rv1==rv2);
		System.out.println("---------");
		System.out.println(rv1.hashCode());
		System.out.println(rv2.hashCode());

	}

}
