package arrays;

public class Tester15 {

	public static void main(String[] args) 
	{
		String rv= "Qspiders is the best institue in the universe";
		String[] ref= rv.split("");
		System.out.println(rv.length());
		System.out.println(ref.length);
		System.out.println(ref[0]);
		System.out.println(ref[4]);
		System.out.println(ref[7]);
		for(String S:ref)
		{
			System.out.println(S);
		}
			

	}

}
