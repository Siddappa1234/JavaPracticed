package arrays;


class B
{
	@Override
	public String toString()// we are overloading tostring method to return string values 
	{
		return "BMW class object";
	}
}
public class Tester11 {

	public static void main(String[] args)
	{
		B[]ref= new B[5];
		ref[0]= new B();
		ref[1]= new B();
		ref[2]= new B();
		ref[3]= new B();
		ref[4]= new B();
		for(int i=0;i<ref.length;i++)
		{
			System.out.println(ref[i]);
		}

	}

}
