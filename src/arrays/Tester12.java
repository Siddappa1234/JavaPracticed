package arrays;

class C
{
	int i;
	C(int i)
	{
		this.i=i;
	}
	@Override
	public String toString ()
	{
		return "["+i+"]";
	}
}
public class Tester12 {

	public static void main(String[] args) 
	{
		C[]ref= new C[5];
		ref[0]= new C(10);
		ref[1]= new C(20);
		ref[2]= new C(30);
		ref[3]= new C(40);
		ref[4]= new C(50);
		for(int i=0;i<ref.length;i++)
		{
			System.out.println(ref[i]);
		}
		

	}

}
