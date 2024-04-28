package com.arrayys;

public class ClassF {
	//task
	public boolean firstLast(int[] nums)
	{
		
		if((nums[0]==6 || nums[nums.length-1]==6))
			return true;
		else
		    return false;
	}
	public static void main(String[] args) {
		ClassF fobj=new ClassF();
		boolean result=fobj.firstLast(new int[] {6,2,1,3,8});
		System.out.println(result);
	}

}
