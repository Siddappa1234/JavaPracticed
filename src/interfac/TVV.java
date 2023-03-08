package interfac;

interface TV 
{
      void display();
      void sound();
      void remote(int channel);
} 
class Sony implements TV
{
	public void display()
	{
		System.out.println("Sony LED display");
	}
	public void sound()
	{
		System.out.println("Sony DTS");
	}
	   public void remote(int channel) 
	{
		System.out.println("Sony is in "+channel);
	}
}
	class Onida implements TV
	{
		public void display()
		{
			System.out.println("Onida LED display");
		}
		public void sound()
		{
			System.out.println("Onida sound system software");
		}
		public void remote(int channel)
		{
			System.out.println("Onida is in "+channel);
		}
	}
	class TVV
	{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Sony s= new Sony();
		s.display();
		s.sound();
		s.remote(90);
		System.out.println("------------------");
         Onida o= new Onida();
         o.display();
         o.sound();
         o.remote(0);
	}

	}



