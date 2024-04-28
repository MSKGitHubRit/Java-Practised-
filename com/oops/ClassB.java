package com.oops;
import java.util.Scanner;

public class ClassB {
	
	void method()
	{
		ClassA aobj=new ClassA();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur name");
//		String n=sc.next();
//		aobj.empname=sc.next();//C.E because of private
		aobj.setEmpname(sc.next());
		System.out.println("enter ur empid");
//		aobj.empid=sc.nextInt();//C.E
		aobj.setEmpid(sc.nextInt());
		System.out.println("enter ur empdept");
//		aobj.empdept=sc.next();C.E
		aobj.setEmpdept(sc.next());
		
		System.out.println("---details------");
		System.out.println("empname"+""+aobj.getEmpname());
		System.out.println("empid"+""+aobj.getEmpid());
		System.out.println("empdept"+""+aobj.getEmpdept());
		sc.close();
				
	}
	
	public static void main(String[] args) {
		
		ClassB bobj=new ClassB();
		bobj.method();
		
	}

}
