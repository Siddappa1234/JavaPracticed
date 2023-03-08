package multithreading;

public class Tester2 {

	public static void main(String[] args) 
	{
		Thread t1= Thread.currentThread();
		System.out.println(t1.getName());
		t1.setName("Salman");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
	    t1.setPriority(10);
	    System.out.println(t1.getPriority());
	    System.out.println(t1.getId());

	}

}
