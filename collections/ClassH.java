package collections;
import java.util.PriorityQueue;
import java.util.Iterator;

public class ClassH {
	
	public void m1()
	{
		System.out.println("passing userdefined classObject to the Priorityqueue");
		PriorityQueue<ClassG>pq=new PriorityQueue<ClassG>();
		ClassG gobj=new ClassG(1,"rahul","Oracle");
		ClassG gobj2=new ClassG(2,"kishan","Oracle");
		ClassG gobj3=new ClassG(3,"vamshi","UI");
		pq.add(gobj);
		pq.offer(gobj2);
		pq.offer(gobj3);
		System.out.println("reterving data using iterator");
		Iterator<ClassG>i=pq.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
	}
	public static void main(String[] args) {
		new ClassH().m1();
	}

}
