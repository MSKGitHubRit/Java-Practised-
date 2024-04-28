package com.oops;
import java.util.Scanner;
public class ClassD {
	
	void method1()
	{
		ClassC cobj=new ClassC();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur empname");
//		cobj.empName=sc.next();//C.E
		cobj.setEmpName(sc.next());
		System.out.println("enter ur empId");
		cobj.setEmpId(sc.nextInt());
		System.out.println("enter ur exp");
		cobj.setExp(sc.nextInt());
		System.out.println("enter ur empsal");
		cobj.setEmpsal(sc.nextFloat());
		
		System.out.println("----Details-------");
		System.out.println("empName:"+cobj.getEmpName());
		System.out.println("empId:"+cobj.getEmpId());
		System.out.println("empexp:"+cobj.getExp());
		System.out.println("empsal:"+cobj.getEmpsal());
		//salary increases if
		
		
	}
	public static void main(String[] args) {
		ClassD dobj=new ClassD();
		dobj.method1();
	}

}
