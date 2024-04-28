package com.inheritnace;

public abstract class ClassI {
	
	//abstraction concept
	
	abstract void meth1();//overridden
	//can abstract method overloaded
	abstract void meth1(String s);
	
	public void meth2()
	{
		System.out.println("hello");
	}
	static void meth3()
	{
		System.out.println("static method");
	}
	ClassI()
	{
		System.out.println("iam constructor");
	}
	public static void main(String[] args) {
//		new ClassI();//C.E Because we can't create the object for the abstract class
		ClassI.meth3();
	}
	

}
