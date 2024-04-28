package java8feautures.assesment.methodreference;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassA {
	
	public void m1()
	{
		System.out.println("m1 called");
		String str[]= {"kiran","rahul","John","Peter","vinay"};
		ArrayList<String>al=new ArrayList<String>();
		for(String x:str)
		{
			al.add(x);
		}
		System.out.println("ArrayList"+al);
		System.out.println("Arrays:"+Arrays.toString(str));
	}
	public void display()
	{
		System.out.println("iam display");
	}
	public static void smethod()
	{
		System.out.println("static method");
	}
	ClassA()
	{
		System.out.println("default construtor");
	}
	public static void main(String[] args) {
		new ClassA().m1();
	}

}
