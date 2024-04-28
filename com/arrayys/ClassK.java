package com.arrayys;

import java.util.Arrays;

public class ClassK {

	public int[] rotateLeft3(int[] nums)
	{
	
		return new int[] {nums[1],nums[2],nums[0]};
			
				
	}
	public static void main(String[] args) {
		
	 ClassK kobj=new ClassK();
	 int  arr1[]= {10,2,3};
	 int[]  result=kobj.rotateLeft3(arr1);
	 System.out.println(Arrays.toString(result));//2,3,10
	 
	}
}
