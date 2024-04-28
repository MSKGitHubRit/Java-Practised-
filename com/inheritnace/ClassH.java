package com.inheritnace;

public class ClassH extends ClassI{
	//abstraction implemented usig Moverriding
	//compulsary 100% u need to implement abstract methods
	void meth1()
	{
		System.out.println("meth1");
//		super.meth2(); oneway
	}
	void meth1(String s)
	{
		System.out.println("meth4");
	}
	public static void main(String[] args) {
		ClassI	iboj=new ClassH();
		iboj.meth1();
		iboj.meth2();
	}

}
//ClassH() default constructor
//will be created 
//Super() default method will call the parent class construtor