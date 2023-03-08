package arrays;

public class Tester13 
{

	public static void main(String[] args) 
	{
		String [] ref= new String[5];
		ref[0]=new String("Hello");
		ref[1]= "Hi";
		ref[2]="Hey";
		ref[3]="Welcome";
		ref[4]="Bye";
		for(int i=0;i<ref.length;i++)
		{
			System.out.println(ref[i]);
		}
		for(String S:ref)
		{
			System.out.println(S);
		}

	}

}
