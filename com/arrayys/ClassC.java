package com.arrayys;

import java.util.Arrays;

public class ClassC {
	
	boolean[] meth1(int input1[],String input2[], char input3[])
	{
		System.out.println(Arrays.toString(input1));
		System.out.println(Arrays.toString(input2));
		System.out.println(Arrays.toString(input3)); 
		return  new boolean[] {true,false,true};
		
	}
	public static void main(String[] args) {
		ClassC aobj=new ClassC();
		int arr1[]= {1,2,3};
		String data[]= {"hello","world"};
		char arr2[]= {'j','a','v','a'};
				
		 boolean[] result=aobj.meth1(arr1, data, arr2);
		 System.out.println(Arrays.toString(result));
		 
		
		
	}

}
