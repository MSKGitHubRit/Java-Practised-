package java8feautures;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class ClassD {
	
	//sorting
	void m1()
	{
	int arr[]= {2,18,10,53,23,2,1,4};
	System.out.println("Arrays:"+Arrays.toString(arr));
	//Arrays.sort(arr);
//	System.out.println(Arrays.toString(arr));
	Arrays.parallelSort(arr,0,4);
	System.out.println("After:"+Arrays.toString(arr));
	Arrays.parallelSort(arr,5,7);
	System.out.println("After:"+Arrays.toString(arr));
	
	}
	public static void main(String[] args) {
		new ClassD().m1();
	}
	

}
