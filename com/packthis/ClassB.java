package com.packthis;

public class ClassB {
	
	ClassB method1()
	{
		System.out.println("method1");
		return this;
	}
	ClassB method2()
	{
		System.out.println("method2");
		return this;
	}
	ClassB method3()
	{
		System.out.println("method3");
		return this;           //new ClassB();
		
	}
	void method4()
	{
		System.out.println("method4");
	}
	public static void main(String[] args) {
		new ClassB().method1().method2().method3().method4();//chaining method
	}

}
