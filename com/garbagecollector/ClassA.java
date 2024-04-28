package com.garbagecollector;

public class ClassA {
	
	public void m1()
	{
		System.out.println("method1() called");
	//	ClassA aobj=new ClassA();
	}
	protected void finalize()
	{
		System.out.println("garbage has been collected");
	}
	public static void main(String[] args) {
		ClassA aobj=new ClassA();
		ClassA aobj2=new ClassA();
		//aobj.m1();
		//aobj=null;//1st
		//aobj.m1();//get null pointer exception because object is null
		aobj=aobj2;//2nd 
		System.gc();
		System.out.println("the hashcode:"+aobj.hashCode());
		System.out.println("the hashcode:"+aobj2.hashCode());
		
		
	
	}
	
	

}
