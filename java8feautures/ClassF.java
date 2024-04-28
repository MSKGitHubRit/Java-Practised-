package java8feautures;

import java.util.Arrays;
import java.util.Optional;

public class ClassF {
	
	public void m1()
	{
		System.out.println("Implementing the OptionalClass");
		String str[]=new String[5];
		str[0]="kiran";
		str[1]="Rahul";
		System.out.println(str[0].toUpperCase());
//		System.out.println(str[4].toUpperCase()); NULLPOINTEREXCEPTION
		Optional<String>o=Optional.ofNullable(str[0]);
		
		if(o.isPresent())
		{
			System.out.println("Data present");
			o.get();
		}
		else
		{
			System.out.println("no data");
		}
		
		
	}
	public static void main(String[] args) {
		new ClassF().m1();
	}
}
