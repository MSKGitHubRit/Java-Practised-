package java8feautures;

public class ClassA 
{
	void show()
	{
	InterfaceA x=()->System.out.println("Hello");
	x.m1();
	InterfaceB y=(int k,int m)->System.out.println("Addition:"+(k+m));
	y.m2(5, 5);
	InterfaceC z=(int p,int q)->
	{
		if(p<q)
		{
			System.out.println("if block");
			return 100;
		}
		else
		{
			System.out.println("else block");
			return 1000;
		}
		
	};
	    int res=z.m3(10, 20);
		System.out.println("the result:"+res);
	}
	public static void main(String[] args) {
		new ClassA().show();
	}
}
