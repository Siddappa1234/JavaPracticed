package arrays;

class A
{

}
public class Tester10 
{
  // output will be fully qualified class with class name and 
	//memory address in the hexadecimal format
	public static void main(String[] args) 
	{
		A[]ref= new A[5];
		ref[0]= new A();
		ref[1]= new A();
		ref[2]= new A();
		ref[3]= new A();
		ref[4]= new A();
		System.out.println(ref.length);
		for(int i=0;i<ref.length;i++)
		{
			System.out.println(ref[i]);
		}

	}

}
