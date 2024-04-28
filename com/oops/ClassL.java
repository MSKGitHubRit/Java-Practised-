package com.oops;

public class ClassL extends ClassJ {
	
	//concept methodoverrding
	//ClassL child class
	void show()//overridding
	{
		System.out.println(10);
	}
	void show(int b)
	{
		System.out.println("hello");
	}
	protected void meth3(int val,String msg)
	{
		System.out.println("helo");
	}
	public void meth4()
	{
		System.out.println("child");
	}
	ClassL message()
	{
		System.out.println("hi");
		return this;
	}
	static void smethod()//it seems like overridng but not
	{
		System.out.println("staticonne");
	}
//	ClassJ()//C.E
//	{
//		System.out.println("constructor willl not supported th");
//	}
	public static void main(String[] args) {
		//inheritance points 1 and 3 using
		ClassJ jobj1=new ClassJ();
//		jobj1.show();
		ClassJ jobj2=new ClassL();
		jobj2.show();
		jobj2.show(10);
		jobj2.meth3(1,"ss");
		jobj2.meth4();
		jobj2.message();
		jobj2.smethod();
		
		
	}

}
