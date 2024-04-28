package com.oops;

public class ClassF extends ClassE {
	
	void meth2()
	{
		System.out.println("class B method");
		
	}
	public static void main(String[] args) {
		ClassE eobj1=new ClassE();
		eobj1.meth1();
//		eobj1.meth2();//c.e
		System.out.println("---");
		ClassE eobj=new ClassF();
		eobj.meth1();
//		eobj2.meth2();//c.e
		System.out.println("---");
		ClassF fobj=new ClassF();
		fobj.meth1();
		fobj.meth2();
		System.out.println("---");
//		ClassF bobj2=new ClassE();//c.e i can't handle my father invalid 
		
	}

}
