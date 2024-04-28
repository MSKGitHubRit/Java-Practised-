package com.arrayys;

import java.util.Arrays;

public class ClassM {
	
	public int[] middleway(int[] a, int[] b)
	{
		return new int[] {a[1],b[1]};
	}
	public static void main(String[] args) {
		ClassM	mobj=new ClassM();
		int input1[]= {1,2,3};
		int input2[]= {4,5,6};
		int[] result=mobj.middleway(input1, input2);
		System.out.println(Arrays.toString(result));//2,5
		
	}

}
