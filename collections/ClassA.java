package collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ClassA {
	
	public void meth1()
	{
		System.out.println("implementing ArrayList");
		ArrayList al=new ArrayList();
		al.add(11);//insertion order followed
		al.add("shiva");//heterogenious supported
		al.add(null);//null values allowed
	    al.add(11);//duplicates allowed
	    al.add(32);//default capacity is 10
	    al.add(16);//size increase half(currentcapacity*3/1+1)
	    al.add(99);
	    
	    System.out.println(al);
	    System.out.println("size:"+al.size());
	    System.out.println("get():"+al.get(2));//accesing specific index
	    System.out.println("Reterving data in the forward order by using forloop");
	    for(int i=0;i<al.size();i++)
	    {
	    	System.out.print(al.get(i)+" "+"\n");
	    }
	    System.out.println("data retervied");
	    System.out.println("-------");
	    System.out.println("reterving data in the reverse direction:");
	    for(int i=al.size()-1;i>=0;i--)
	    {
	    	System.out.print(al.get(i)+" ");
	    }
	    System.out.println();
	    System.out.println("reterving data using foreachloop");
	    for(Object  x:al) //Integer x:al or9 int x: al but nullnot supported for int auto-unboxing)
	    {
	    	System.out.print(x+" ");
	    }
	    System.out.println("\n");
	    System.out.println("reterving data using Iterator Interface");
	    Iterator i=al.iterator();//return type is Iterator
	    while(i.hasNext())
	    {
	    	System.out.print(i.next()+" ");
	    }
	    System.out.println("-method--");
	    al.add(20);
	    System.out.println(al);
//	    System.out.println(al.isEmpty());
//	    al.clear();
//	    System.out.println(al);
	    System.out.println(al.isEmpty());
	    System.out.println(al.contains(32));
	    ArrayList al2=new ArrayList();
	    al2.add(11);
	    al2.add(16);
	    System.out.println(al.containsAll(al2));
	    System.out.println(al);
	    System.out.println("remove:"+al.remove((Object)11));
	    System.out.println(al);
	    System.out.println("remove:"+al.remove(1));
	    System.out.println(al);
	    System.out.println(al2);
	    System.out.println("removeall:"+al.removeAll(al2));
	    System.out.println(al);
//	    System.out.println("retainall:"+al.retainAll(al2));
//	    System.out.println(al);
	    al.add(2,100);
	    System.out.println(al);
	    al.set(al.size()-1,200);
	    System.out.println(al);
	    System.out.println(al2);
	    System.out.println("before:"+al);
	    al.addAll(al2);
	    System.out.println("after:"+al);
	   
	    
	    
	    
	    
	    
	}
	public static void main(String[] args) {
		new ClassA().meth1();
	}

}
