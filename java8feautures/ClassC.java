package java8feautures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassC {
	
	public void m1()
	{
		System.out.println("Implementing the StreamAPI");
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println("before:"+al);
		Stream<Integer>i=al.stream();
		Stream<Integer>i2=i.map(data->(data*10));
//		System.out.println(i2);
		List<Integer>i3=i2.collect(Collectors.toList());
		System.out.println("After:"+i3);
		
	}
	public static void main(String[] args) {
		new ClassC().m1();
	}

}
