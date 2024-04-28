package innerclass;

public class ClassA {
	int a=10;//instance
	static int b=20;
	
	private void m1()
	{
		System.out.println("Outer m1() called");
	}
	static 
	{
		System.out.println("Outer static block");
	}
	ClassA()
	{
		System.out.println("Outer constructor block");
	}
	public static class InnerClassA
	{
		void m2()
		{
			System.out.println("instance of outerclass:"+new ClassA().a);
			System.out.println("static of  outerclass:"+b);
			System.out.println("inner method");
			new ClassA().m1();
		}
		InnerClassA()
		{
			System.out.println("inner constructor");
		}
		static 
		{
			System.out.println("inner static block");
		}
		public static void main(String[] args) {
			System.out.println("innermain() method");
		}
	}
	public static void main(String[] args) {
		System.out.println("outer main()method");
		new ClassA().m1();
//		ClassA.InnerClassA iobj=new ClassA().new InnerClassA();
		ClassA.InnerClassA iboj=new ClassA.InnerClassA();
		
		iboj.m2();
	}

}
