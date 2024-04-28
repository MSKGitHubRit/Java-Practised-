package java8feautures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassE {
	
	public void m1()
	{
		System.out.println("Implementing StreamAPI");
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(30);
		al.add(80);
		al.add(65);
		al.add(44);
		System.out.println("before"+al);
		Collections.sort(al);
		System.out.println("After:"+al);
		Stream<Integer>i=al.stream();
		Stream<Integer>i2=i.sorted();
		List<Integer>i3=i2.collect(Collectors.toList());
		System.out.println("two way:"+i3);
		System.out.println("third way");
		TreeSet<Integer>ts=new TreeSet<Integer>(al);
		System.out.println(ts);
	}
	public static void main(String[] args) {
		new ClassE().m1();
	}

}
