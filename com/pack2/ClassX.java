package com.pack2;
import com.pack1.ClassA;//one way
//import com.pack1.*;//two way


public class ClassX extends ClassA{
	public static void main(String[] args) {
		ClassA aobj=new ClassA();
//		ClassB bobj=new ClassB();
//	 	aobj.method1();c.e
		ClassX xobj=new ClassX();
		xobj.method1();
	 com.pack1.ClassB bobj=new com.pack1.ClassB();
	 	bobj.meth2();
	 
	}

}
