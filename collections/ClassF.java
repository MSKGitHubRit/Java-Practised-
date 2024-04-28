package collections;
import java.util.PriorityQueue;
import java.util.Iterator;

public class ClassF {
	
	public void m1()
	{
		System.out.println("Implementing the Priority Queue");
		PriorityQueue<Object>pq=new PriorityQueue<Object>();
		pq.add(10);//insertion order
//		pq.offer("Java");//Heterogenous are not allowed
		pq.add(10);//duplicates are
		pq.offer(20);//available from java 1.5v
		pq.offer(3);//default capacity is 11
		pq.offer(2);//size increases by double
//		pq.offer(null);//null are not allowed
		pq.offer(45);//synchronization are not allowed
		System.out.println(pq+"\n");
		//in the priority queue always be lowest element
		System.out.println("queue methods:");
		System.out.println("poll():"+pq.poll());//going to remove the firstelement and returns the next lowest element
		System.out.println(pq);
		System.out.println("remove():"+pq.remove());//going to remove firstelement and returns the next lowest element
		System.out.println(pq);
		System.out.println("The difference poll vs remove");
//		pq.clear();
//		System.out.println("poll():"+pq.poll());
		//if no elements in the queue it will returns the null value as o/p..
//		System.out.println("remove():"+pq.remove());
		//if no elements present in the the queuue it will returns an exception i.e NoSuchElementException
//		System.out.println("peek():"+pq.peek());//it will only shows the first element.
		System.out.println("reterving the data using iterator");
		Iterator<Object>i=pq.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
	}
	public static void main(String[] args) {
		new ClassF().m1();
	}

}
