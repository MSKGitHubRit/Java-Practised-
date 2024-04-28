package map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public class ClassB {
	
	public void m1()
	{
		System.out.println("implementing TreeMap");
		TreeMap<Object,Object>tm=new TreeMap<Object,Object>();
		tm.put(101, "Oracle");//insertion order is NOT maintained but sorting order of key maintained
		tm.put(116, "java");//heterogenious key not allowed and heterogenious values are
		tm.put(105, null);//null values are allowed
		tm.put(103, "Oracle");//duplicates values are allowed
		tm.put(107, "sql");//avialabe version from java 1.2v[Load factor]
		tm.put(108, 104);//default capacity  is 16
		tm.put(112, 108);//size increases by double
		tm.put(115, 110);//synchronization is not allowed
		System.out.println(tm);
		System.out.println("reterving data using collection classes");
		ArrayList<Object>al=new ArrayList<Object>(tm.entrySet());
		Iterator<Object>ll=al.iterator();
		while(ll.hasNext())
		{
			Entry e=(Entry)ll.next();
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		System.out.println("---------");
		System.out.println("reterving data using descending order without usind listiterator");
		TreeSet<Object>ts=new TreeSet<Object>(tm.keySet());
		Iterator d=ts.descendingIterator();
		while(d.hasNext())
		{
			System.out.print(d.next()+" ");
		}
		
	}
	public static void main(String[] args) {
		new ClassB().m1();
	}

}
