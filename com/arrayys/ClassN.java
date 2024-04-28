package com.arrayys;

import java.util.Arrays;

public class ClassN {
	
	public int[] makeEnds(int[] nums)
	{
		return new int[] {nums[0],nums[nums.length-1]};
	}
	public static void main(String[] args) {
		ClassN nobj=new ClassN();
		int input[]= {7,4,6,2};
		int[]result=nobj.makeEnds(input);
		System.out.println(Arrays.toString(result));
	}

}
