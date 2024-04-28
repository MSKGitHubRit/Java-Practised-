package map;
import java.util.ArrayList;
//import java.util.HashTable;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;


public class ClassC {
	
	public void m1()
	{
		System.out.println("Implementing the HashTable");
		Hashtable<Object,Object>ht=new Hashtable<Object,Object>();
		ht.put(101,"abc");//inserting order is NOT MAINTAINED
		ht.put("xyz", "bcd");//heterogenious keys and heterogenious values are allowed
		ht.put(102, "abc");//duplicates values are allowed
		ht.put(104, "xxx");//null keys and null values are not allowed
		ht.put(105, "Oracle");//available version from java 1.2v
		ht.put(108, "UI");//default capacity is 11 (as priority queue)
		ht.put("java","kishan");//size increases by double
		ht.put(109, "xyz");//it is SYNCHRONIZED 
		
		System.out.println(ht);
		System.out.println("retervind data using any collectionclass");
		ArrayList<Object>al=new ArrayList<Object>(ht.entrySet());
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Entry e=(Entry)i.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}
	public static void main(String[] args) {
		new ClassC().m1();
	}

}
