package abstraction;

abstract class vechile 
{
    abstract void engine();
}
   class KTM extends vechile
  {
	  public void engine()
	  {
		  System.out.println("KTM Bike Engine");
	  }
  }
   class Royalenfield extends vechile
  {
	  public void engine()
	  {
		  System.out.println("Royal Bike Engine Royals");
	  }
  }
	  public class Bike
	  {
	public static void main(String[] args)
	{
		KTM Q= new KTM();
		Q.engine();
		Royalenfield W= new Royalenfield();
         W.engine();
	}

   }
