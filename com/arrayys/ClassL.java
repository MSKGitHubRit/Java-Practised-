package com.arrayys;

import java.util.Arrays;

public class ClassL {
	
	public int[]  maxEnd3(int[] nums)
	{
		int x;
		if(nums[0]>nums[nums.length-1])
			 x=nums[0];
		else
			x=nums[nums.length-1];
		//print
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=x;
		}
		return nums;
	}
	public static void main(String[] args) {
		ClassL lobj=new ClassL();
		int arr1[]= {1,288,3};
		int []result=lobj.maxEnd3(arr1);
		System.out.println(Arrays.toString(result));
				
	}

}
