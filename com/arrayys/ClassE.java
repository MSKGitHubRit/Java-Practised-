package com.arrayys;

public class ClassE {
	//checking the array length is > or equval to or 0....
	int meth3(int [] arr)
	{
		if(arr.length>=2)
			return arr[0]+arr[1];
		else if(arr.length==1)
			return arr[0];
		else
			return 0;
	}
	public static void main(String[] args) {
		ClassE aobj=new ClassE();
		int result=aobj.meth3(new int[] {8,2,4,6});
		System.out.println(result);//10
	}

}
