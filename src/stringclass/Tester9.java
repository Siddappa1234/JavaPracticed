package stringclass;

public class Tester9 
{
	static void remove (String rv,int index)
	{
		String s1=rv.substring(0,index);
		String s2=rv.substring(index+1);
		String s3=s1+s2;
		System.out.println("Given String = "+rv);
		System.out.println("Resultant string = "+s3);
	}
	public static void main(String[] args) 
	{
		remove("Qspiders",0);
		remove("Qspiders",1);
		remove("Qspiders",2);
		

	}

}
