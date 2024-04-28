package com.packthis;

public class ClassA {
	
	int x=5;
	static int y=3;
	void method1()
	{
		int x=4;
//		System.out.println(x);
		System.out.println("instance variable:"+this.x);
		System.out.println("accesing static variable:"+ClassA.y);
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
	}
	public static void main(String[] args) {
		new ClassA().method1();
	}

}
