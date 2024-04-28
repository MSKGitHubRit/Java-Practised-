package com.arrayys;

import java.util.Arrays;

public class ClassA {
	
		 void meth1()
		{
			int arr1[];//declaration
			arr1=new int[5];
			int arr2[]=new int[4];
			int arr3[]= {111,222,333};
			int arr4[]=new int[] {11,12,13,14,15,16};
			String s="Java";
			System.out.println("---length-----");
			System.out.println("arr1:"+arr1.length);
			System.out.println("arr2:"+arr2.length);
			System.out.println("arr3:"+arr3.length);
			System.out.println("arr4:"+arr4.length);
			System.out.println("s:"+s.length());
			System.out.println("---Data inArray------");
			System.out.println("arr1:"+Arrays.toString(arr1));
			System.out.println("arr2:"+Arrays.toString(arr2));
			System.out.println("arr3:"+Arrays.toString(arr3));
			System.out.println("arr4:"+Arrays.toString(arr4));
			System.out.println("--------------------");
			/*an index postion of an array is used to pass the
			 * data in array and reterview the data back from an array*/
			System.out.println(arr3[1]);
			arr1[1]=25;
			arr1[3]=45;
			System.out.println("arr1:"+Arrays.toString(arr1));
			System.out.println(arr1[arr1.length-1]);
			System.out.println(arr1[arr1[arr2.length-1]]);
			System.out.println(arr4[arr3[1]*0]);
//			System.out.println(arr4[arr1.length-arr2.length-1]);
			System.out.println(arr4[arr1.length-(arr2.length-2)]);
			System.out.println(arr2[arr1.length-1]);//AIOB EXception
			
		}
		 public static void main(String [] args)
		 {
			 new ClassA().meth1();	
		 }
		
		
	}


