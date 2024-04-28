package collections.com;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassB {
	
	public void meth1()
	{
		System.out.println("Implementing the ArrayList");
		ArrayList<ClassA>al=new ArrayList<ClassA>();
		ClassA aobj1=new ClassA(101,"muqeeth","Oracle");
		ClassA aobj2=new ClassA(102,"khallel","sql");
		ClassA aobj3=new ClassA(103,"shakeer","Java");
		al.add(aobj1);
		al.add(aobj2);
		al.add(aobj3);
		al.add(new ClassA(104,"kishan","java"));
		System.out.println(al+"\n");
		//iam using iterator
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	
	}
	public static void main(String[] args) {
		ClassB bobj=new ClassB();
		bobj.meth1();
	}

}
