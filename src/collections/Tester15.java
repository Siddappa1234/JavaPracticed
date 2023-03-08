package collections;

import java.util.LinkedHashSet;

public class Tester15 {

	public static void main(String[] args) 
	{
		LinkedHashSet set= new LinkedHashSet();
		set.add(10);
		set.add(10.5);
		set.add('A');
		set.add(true);
		set.add("Hey");
		set.add(10);
		System.out.println(set);
		System.out.println(set.size());

	}

}
