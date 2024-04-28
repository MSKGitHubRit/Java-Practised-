package com.arrayys;

import java.util.Arrays;

public class ClassO {
	
	public int[] makeLast(int[] nums)
	{
		//logicm first instansation array
		//every default of int will be the zero
		int arr[]=new int[2*nums.length]; //2*3=6 
		arr[arr.length-1]=nums[nums.length-1];
		return arr;
	 
	}
	public static void main(String[] args) {
		ClassO obj=new ClassO();
		int input[]= {4,5,6};
		int[] result=obj.makeLast(input);
		System.out.println(Arrays.toString(result));//expected 0,0,0,4,5,6
	}

}
