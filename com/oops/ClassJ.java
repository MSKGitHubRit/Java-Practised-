package com.oops;

public class ClassJ {
	
	//concept methodoverriding
	//ClassJ parent class
	void show()//overridden
	{
		System.out.println("hello");
	}
	void show(int a)
	{
		System.out.println("20");
	}
	protected void meth3(int a,String val)
	{
		System.out.println("world");
	}
	public void meth4()
	{
		System.out.println("meth4");
	}
	 ClassJ message()
	  { //new ClassJ(); we can return object or this
		 System.out.println("co-varient");
		 return this;
	  }
	 ClassJ()
	 {
		 System.out.println("not supported");
	 }
	static void smethod()
	 {
		 System.out.println("smethod");
	 }
  
	
	
	
	

}
