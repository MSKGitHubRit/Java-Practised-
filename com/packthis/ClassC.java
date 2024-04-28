package com.packthis;

public class ClassC {
	//it used to return present class methods
	public ClassC()
	{
		this(50);
		System.out.println("method1 called ");
//		new ClassC().method1();
		
		
	}
	public ClassC(int x)
	{
		System.out.println("method2 called"+x);
		
	}
	static void method3()
	{
		
		System.out.println("method3 called");
	}
	public static void main(String[] args) {
		ClassC aobj=new ClassC();
		aobj.method3();
	
	}

}
