package com.arrayys;

public class ClassG {
	//if firstelement and last element will equval returns the true or else false
	//if lenght >1 
	public boolean sameFirstLast(int [] nums)
	{
		if(nums.length>=1 && nums[0]==nums[nums.length-1])
		
			return true;
			else
			return false;
		
	}

	public static void main(String[] args) {
		ClassG gobj=new ClassG();
		
		boolean result=gobj.sameFirstLast(new int[] {1,2,1});
		System.out.println(result);
	}

}
