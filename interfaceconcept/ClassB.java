package interfaceconcept;

public class ClassB extends ClassA implements InterfaceA,InterfaceB{
	
	public void meth1()//public access resrictiion not more than parent
	{
		System.out.println("abstract method overidden");
	}
	public void display()
	{
		System.out.println("abstract method of interfaceB overridden");
	}
	
	public static void main(String[] args) {
			InterfaceA bobj=new ClassB();
			bobj.meth1();
			bobj.meth2();
//			bobj.display();//c.e because display not belogn to interfaceA
			InterfaceB bobj1=new ClassB();
			bobj1.display();
			new ClassB().show();
	}

}
