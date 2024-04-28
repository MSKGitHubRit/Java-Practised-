package collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ClassE {
	
	public void m1()
	{
		System.out.println("implementing the TreeSet");
		TreeSet<Object> set=new TreeSet<Object>();
		set.add(10);//insertion order is not maintained but sorted order followed default ascending
		set.add(20);//null are not allowed
		set.add(60);//heterogenious are not supported
		set.add(10);//duplicates are not allowed
		set.add(30);//availabe version from the java 1.2v
		set.add(20);//default capacity is 16
		set.add(90);//size increases by double
		set.add(33);//not synchronized
		System.out.println(set+" \n");
//		System.out.println(set.get(0));// C.E 
		Iterator<Object>i=set.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("\n");
		System.out.println("sort in descendorder");
		Iterator<Object>i2=set.descendingIterator();
		while(i2.hasNext())
		{
			System.out.print(i2.next()+" ");
		}
		System.out.println("\n");
		System.out.println("headSet():"+set.headSet(30));
		System.out.println("tailset():"+set.tailSet(30));
		
		
		
	}
	public static void main(String[] args) {
		new ClassE().m1();
	}

}
