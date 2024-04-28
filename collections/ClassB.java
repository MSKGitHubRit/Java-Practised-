package collections;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ArrayList;

public class ClassB {
	
	public void method1()
	{
		System.out.println("Implemnting vector");
		Vector<Object>v=new Vector<Object>();
		v.add(12);//insertion order
		v.add("java");//heterogenious
		v.add(12);//duplicates allowd
		v.add(32);//available version from java 1.0
		v.add(22);//default capacity 10
		v.add(12);//increase size double
		v.add(32);//not follow synchronization
		System.out.println(v);
		System.out.println("retervind data using iterator");
		Iterator<Object> i=v.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println();
		System.out.println("retervind data using enumeration");
		Enumeration<Object> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
		System.out.println("\n");
		System.out.println("capacity:"+v.capacity());
		System.out.println("size:"+v.size());
		v.add(10);
		v.add(20);
		System.out.println("capacity:"+v.capacity());
		System.out.println("size:"+v.size());
		v.add(1,10);
		System.out.println(v);
		v.addElement(200);
		System.out.println(v);
		System.out.println(v.remove((Object)12));
		System.out.println(v);
		//i want to remove all duplicates from the vector
	//take any list ur wish
		
		ArrayList<Object>al=new ArrayList<Object>();
		al.add(12);
		System.out.println("before:"+v);
		v.removeAll(al);
		System.out.println("after:"+v);
		v.lastElement();
		System.out.println("last"+v);
		v.firstElement();
		System.out.println("first"+v);
		 
		
	}
	public static void main(String[] args) {
		new ClassB().method1();
	}

}
