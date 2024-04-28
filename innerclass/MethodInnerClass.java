package innerclass;



public class MethodInnerClass {
	
	public void show()
	{
		System.out.println("iam show outer");
		String s="java";
		class InnerClassA
		{
			void meth1()
			{
				System.out.println(s.concat("is awesome"));
			}
			InnerClassA()
			{
				System.out.println("constructor");
			}
			
		}
		InnerClassA iobj=new InnerClassA();
		iobj.meth1();
		
	}
	public static void main(String[] args) {
		new MethodInnerClass().show();
	}

}
