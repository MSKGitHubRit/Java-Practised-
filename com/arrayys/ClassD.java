package com.arrayys;

import java.util.Arrays;

public class ClassD {
	
	int[] meth1()
	{
		int arr[]= {1,2,3};
		//writing logic
		for(int i=0;i<3;i++)
		{
			if(arr[i]==2&&arr[i+1]==3)
			arr[i+1]=0;
			
		}
		return arr;
	}
	public static void main(String[] args) {
		ClassD dobj=new ClassD();
		int[] result=dobj.meth1();
		System.out.println(Arrays.toString(result));
	}

}
