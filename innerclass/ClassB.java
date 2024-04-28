package innerclass;

public class ClassB {
	
	static OuterClass iobj=new OuterClass()//anomous innerclass
	{
	@Override
	public  void print()
	{
		System.out.println("start");
		super.print();
		System.out.println("iam print() method ");
		System.out.println("End");
	}
	};
	public static void main(String args[])
	{
		iobj.print();
//		new ClassB().iobj.print();
		
	}

}
