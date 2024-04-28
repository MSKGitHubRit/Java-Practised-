package com.arrayys;

public class ClassI {
	
	public boolean commonEnd(int [] a, int[] b)
	{
		//if firstelement or last element true it  returns true
		if(a[0]==b[0] || a[a.length-1]==b[b.length-1])
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
			ClassI iobj=new ClassI();
			int input1[]= {1,2,3};
			int input2[]= {1,3};
		    boolean	result=iobj.commonEnd(input1,input2);
		    System.out.println(result);
	}

}
