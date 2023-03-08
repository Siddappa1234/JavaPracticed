package collections;

import java.util.ArrayList;

public class Tester1 
{
    
	public static void main(String[] args) 
	{
		 ArrayList list= new ArrayList();
		 list.add(10);
		 list.add(10.5);
		 list.add('A');
		 list.add("Hey");
		 list.add(true);
		 list.add(null);
		 list.add(10);
		 //list.add(new A());
		 System.out.println(list.size());
		 System.out.println(list);
		 System.out.println(list.get(0));
		 System.out.println(list.get(5));
		 System.out.println("-----");
		 for(int i=0;i<list.size();i++)
		 {
			 System.out.println(list.get(i));
		 }
		 
		 
		 

	}

}
