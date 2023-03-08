package abstractclass;

abstract class Animal 
{
    abstract void move();
    abstract void sound();
}
  class cat extends Animal
  {
	  void move()
	  {
		  System.out.println("cat moves");
	  }
	  void sound()
	  {
		  System.out.println("Meow meow");
	  }
  class Dog extends Animal
  {
	  void move()
	  {
		  System.out.println("Dog move");
	  }
	  void sound ()
	  {
		  System.out.println("Bow Bow ");
	  }
  }
  class Tester1
  {
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		cat c= new cat();
		c.move();
		c.sound();
		System.out.println(" Main Ends ");

	}

}
  }
