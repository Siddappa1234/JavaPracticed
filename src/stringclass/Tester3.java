package stringclass;

public class Tester3 {

	public static void main(String[] args)
	{
		String rv1= new String("Watermelon");
		String rv2="Watermelon";
		String rv3= "Water";
		String rv4="Melon";
		String rv5= "Water"+"Melon";
		String rv6="Water"+rv4;
		System.out.println(rv1==rv2);
		System.out.println(rv2==rv5);
		System.out.println(rv1=rv6);
	}

}
