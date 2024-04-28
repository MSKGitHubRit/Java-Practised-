package com.inheritnace;

public class ClassF {
	void meth1()
	{
		System.out.println(10);
		System.out.println(this.meth2()+56);
	}
	int meth2()
	{
		System.out.println(75);
		System.out.println(90);
		return this.meth3();
	}
	int meth3()
	{
		System.out.println(79);
		System.out.println(92);
		return 74-92;
	}
	void meth4() 
	{
		System.out.println(56);
	}
	ClassF()
	{
		this(52);
		this.meth1();
		System.out.println(85);
	}
	ClassF(int a)
	{
		System.out.println(a+7);
	}

}
