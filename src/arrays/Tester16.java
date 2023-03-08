package arrays;

public class Tester16 {

	public static void main(String[] args) 
	{
		//String rv="Samu+is+beautiful";
		//String[] ref=rv.split(" // + ");
		//for(String S:ref)
		//{
			//System.out.println(S);
		//}
		String s1="welcome to split world";
		System.out.println("returning words:");
		for(String w:s1.split("\\s",0)){
		System.out.println(w);
		}
		System.out.println("returning words:");
	}

}
