package collections;

import java.util.ArrayList;

public class Tester5 {

	public static void main(String[] args)
	{
		ArrayList list= new ArrayList();
		list.add("Hello");
		list.add("Hey");
		list.add(90.9);
		System.out.println(list.remove("Hello"));
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list);

	}

}
