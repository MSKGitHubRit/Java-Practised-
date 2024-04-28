package finalconcept;

public class ClassB extends ClassA{//we can't extend the ClassA because of Final Class
	@Override
	public void method()//C.E BECAUSE FINAL CAN'T BE OVERRIDDEN
	{
		System.out.println("overrideen method");
	}
	public static void main(String[] args) {
		ClassA aobj=new ClassB();
		aobj.method();
	}

}
