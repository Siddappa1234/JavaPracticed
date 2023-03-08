package collections;

import java.util.HashSet;

public class Tester13 {

	public static void main(String[] args) 
	{
		HashSet set= new HashSet();
		set.add(10);
		set.add(10.5);
		set.add('A');
		set.add(null);
		set.add(10);
		set.add(10);
		set.add("Hey");
		System.out.println(set.size());
		System.out.println(set);
		

	}

}
