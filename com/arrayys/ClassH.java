package com.arrayys;

import java.util.Arrays;

public class ClassH {
	
	public  int[] makepi(int arr[])
	{
	
		for(int i=0;i<arr.length;i++)
		{
			arr[0]=3;
			arr[1]=1;
			arr[2]=4;	
		}
		return arr;
	}
	public static void main(String[] args) {
		 ClassH hobj=new ClassH();
		 int input[]= {3,1,4};
		 int[] result=hobj.makepi(input);
		 System.out.println(Arrays.toString(result));//3,1,4
	}

}
