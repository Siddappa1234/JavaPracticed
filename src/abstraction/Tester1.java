package abstraction;

interface Switch
{
   void on();
   void off();
}

	class Bulb implements Switch
	{
	public void on()
	{
		System.out.println("Bulb is turned on");
	}
	public void off()
	{
		System.out.println("Bulb is turned off");
	}
	}	
	class Fan implements Switch
	{
	public void on()
	{
		System.out.println("Fan is turnd on");
	}
	public void off()
	{
		System.out.println("Fan is turned off");
	}
	}
	class Myroom
	{
		static Switch myswitch(char ch)
		{
		if(ch=='A')
		{
			return new Bulb();
		}
		else 
		{
			return new Fan();
		}
		}
	}


 class Tester1 
 {

	public static void main(String[] args) 
	{
		Switch s1=Myroom.myswitch('f');
		s1.on();
		s1.off();
		System.out.println("Done");

	}
 
}
