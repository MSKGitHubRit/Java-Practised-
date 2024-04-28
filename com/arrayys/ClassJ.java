package com.arrayys;



public class ClassJ {

	public int sum3(int[] nums)
	{
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			
			sum=sum+nums[i];
		}
		return sum;
	}
	public static void main(String[] args) {
	ClassJ	jobj=new ClassJ();
	int arr1[]= {1,2,3};
	int result=jobj.sum3(arr1);
	System.out.println(result);
	}
}
