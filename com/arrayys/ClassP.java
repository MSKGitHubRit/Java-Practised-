package com.arrayys;
import java.util.Scanner;

public class ClassP {
	
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		int arr[]= {2,3,5,1,2,6,9,2,4,7,4,2};
		System.out.println("please enter the number");
		int x=sc.nextInt();
		System.out.println("the number you entered:"+x);
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			count++;
		}
		System.out.println("The number repeated times are:"+count);
		sc.close();
	}
	public static void main(String[] args) {
		new ClassP().meth1();
	}

}
