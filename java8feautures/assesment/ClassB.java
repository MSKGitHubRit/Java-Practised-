package java8feautures.assesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeSet;

public class ClassB {
	
	public void show()
	{
		System.out.println("Implementing the LambdaExpression");
		InterfaceB xobj=(HashMap<Object,Object>map,String s[])->
		{
			ArrayList<Object>al=new ArrayList<Object>(map.entrySet());
			Iterator<Object>i=al.iterator();
			while(i.hasNext())
			{
				Entry e=(Entry)i.next();
				System.out.println(e.getKey()+" "+e.getValue());
			}
			System.out.println("Arrays:"+Arrays.toString(s));
			TreeSet<Object>ts=new TreeSet<Object>(map.keySet());
			return ts;
			
		};
		HashMap<Object,Object>hm=new HashMap<Object,Object>();
		hm.put(101,"Oracle");
		hm.put(102, "java");
		hm.put(103, "AWS");
		String str[]= {"ABC","XYZ","LOP"};
		TreeSet<Object>set=xobj.meth1(hm,str);
		System.out.println("treeset:"+set);
	}
	public static void main(String[] args) {
		new ClassB().show();
	}

}
