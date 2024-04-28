package java8feautures.assesment.methodreference;

public class ClassB {
	
	public void mr()
	{
		System.out.println("implementing methodreference");
//		InterfaceA x=new ClassA()::display;
//		x.msg();
//		InterfaceA x2=new ClassA::smethod();
//		x2.msg();
		InterfaceA x3=ClassA::new;
		x3.msg();
		
	}
	
	public static void main(String[] args) {
		new ClassB().mr();
	}
}
