package collections;

import java.util.PriorityQueue;

public class Tester11 {

	public static void main(String[] args)
	{
		PriorityQueue queue= new PriorityQueue();
		queue.add(10.5);
		queue.add(10.4);
		queue.add(10.3);
		queue.add(10.2);
		queue.add(10.1);
		System.out.println(queue);
		int size=queue.size();
		for(int i=1;i<=size;i++)
		{
			System.out.println(queue.poll());
		}

	}

}
