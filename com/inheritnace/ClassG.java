package com.inheritnace;

public class ClassG extends ClassF {

	void display()
	{
		System.out.println("hi");
		super.meth4();
	}
	static int show(int a)
	{
		System.out.println(a+a);
		return a+a++;
	}
	ClassG()
	{
		this(show(50));
		for(int i=1; ;i++)
		{
			super.meth4();
			break;
		}
		System.out.println("hi");
		System.out.println(show(50));
	}
	ClassG(int a)
	{
		System.out.println("x==>"+(a+++show(50)));
	}
	public static void main(String[] args) {
		new ClassG().display();
	}
	
}
