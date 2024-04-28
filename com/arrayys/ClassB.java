package com.arrayys;

public class ClassB {
	//mutlidimentsion array
	
	void meth1()
	{	
	int arr[][]=new int[3][3];
	int x=1;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			arr[i][j]=x;
			x++;
		}
	}
	System.out.println("----------");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println(" ");
	}
		
	}
	public static void main(String[] args) {
		new ClassB().meth1();
	}
	


}
