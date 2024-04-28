package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.LinkedHashSet;
/*here program were both hashSet and LinkedHashSet
 * the only difference is insertion order */

public class ClassD {
	
	public void meth1()
	{
		System.out.println("implementing HashSet():");
//		HashSet<Object>set=new HashSet<Object>(); //insertion order not maintained from java 1.2v
		LinkedHashSet<Object>set=new LinkedHashSet<Object>();//insertion order maintained from java 1.4v
		set.add(10);//insertion order
		set.add("java");//heterogenious data
		set.add(10);//duplicates are 
		set.add(null);//nulls are allowed
		set.add(50);//available version from the java.1.2v
		set.add(80);//default capacity is 16
		set.add(40);//size increases by the double
		System.out.println(set+"\n");
		System.out.println(set.size());
//		System.out.println(set.get(0)); //C.E because index is not supported
		System.out.println("retervind data using for-each");
		for(Object o:set)
		{
			System.out.print(o+" ");
		}
		System.out.println("\n");
		System.out.println("retervind data using iterator");
		Iterator<Object> i=set.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("\n");
//		ListIterator i=set.ListIterator();//C.E directly not possible
		System.out.println("implemented ArrayList");
		ArrayList<Object>li=new ArrayList<Object>(set);
		ListIterator<Object>i1=li.listIterator();
		System.out.println("reterved data in reverseorder");
		while(i1.hasNext())
		{
			System.out.print(i1.next()+" ");
		}
		System.out.println();
		while(i1.hasPrevious())
		{
			System.out.print(i1.previous()+" ");
		}
		System.out.println("\n");
	
	}
	public void m2()
	{
		System.out.println("enjoying collections");
		ArrayList<Object>al=new ArrayList<Object>();
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(20);
		System.out.print(al+" ");
		LinkedHashSet<Object>set=new LinkedHashSet<Object>(al);
		System.out.println("\n");
		System.out.println("linkedHashset:"+set);
		
	}
	public static void main(String[] args) {
		new ClassD().meth1();
		new ClassD().m2();
	}

}
