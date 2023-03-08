package stringclass;

public class Tester7 
{

	public static void main(String[] args) 
	{
		String rv="Welcome";// Reverse string and check whether it is palindrome or not 
		System.out.println("original string is"+rv);
		System.out.println("Reversed string is");
		for(int i=rv.length()-1;i>=0;i--)
		{
			System.out.println(rv.charAt(i));
		}

	}

}
