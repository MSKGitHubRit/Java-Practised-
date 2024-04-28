package collections;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class ClassC {
	
	public void meth1()
	{
		System.out.println("implementing LinkedList");
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add(10);//order is
		ll.add("java");//heterogenious is 
		ll.add(null);//null are 
		ll.add(10);//duplicates are
		ll.add(3);//avaible version from 1.2v
		ll.add(9);//default capacty is 0
		ll.add(10);//not allows synchronization
		
		System.out.println(ll);
		System.out.println("reterevind data using Iterator:");
		Iterator<Object> l=ll.iterator();
		while(l.hasNext())
		{
			System.out.print(l.next()+" ");//forward direction
		}
		System.out.println("");
		System.out.println("retervind data using ListIterator:");
		ListIterator<Object>li=ll.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println("---");
		while(li.hasPrevious())
		{
		
			System.out.print(li.previous()+" ");
		}
		System.out.println("");

	}
	public static void main(String[] args) {
		new ClassC().meth1();
	}

}
