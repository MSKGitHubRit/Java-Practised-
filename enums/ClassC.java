package enums;

import java.util.Scanner;

public class ClassC {
	
	public String show()
	{
		System.out.println("implemeting enum");
		Scanner sc=new Scanner(System.in);
		Days v=Days.wednesday;
		System.out.println(v);
		String work=" ";
		switch(v)
		{
		case monday:
			System.out.println("user selected monday");
			System.out.println("please assign the task");
			work=sc.nextLine();
			break;
		case tuesday:
			System.out.println("user selected tuesday");
			System.out.println("please assign the task");
			work=sc.nextLine();
			break;
		case wednesday:
			System.out.println("user selected wednesday");
			System.out.println("please assign the task");
			work=sc.nextLine();
			break;
			
		}
		return work;
		
	}
	public void m2()
	{
		System.out.println("retervind data foreachloop");
		Days arr[]=Days.values();
		for(Days x:arr)
		{
			System.out.println(x);
		}
		System.out.println("retervind data using forloop");
		System.out.println("-------");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		ClassC cobj=new ClassC();
//		String r=cobj.show();
//		System.out.println(r);
		System.out.println("----------");
		cobj.m2();
	}

}
