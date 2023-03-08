package boxing;

public class Tester6 {

	public static void main(String[] args)
	{
		int count=0;
		String S1= "Here9972343805090";
		for(int i=0;i<S1.length();i++)
		{
			char ch=S1.charAt(i);
			if(Character.isDigit(ch));
			{
				count++;
			}
			System.out.println(count);
		}

	}

}
