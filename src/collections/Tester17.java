package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Tester17 {

	public static void main(String[] args) 
	{
		HashSet set= new HashSet();
		set.add(10);
		set.add(10.5);
		set.add(null);
		set.add('A');
		set.add(true);
		set.add(90.5);
		System.out.println(set);
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(set);

	}

}
