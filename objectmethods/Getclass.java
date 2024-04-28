package objectmethods;

public class Getclass {
	public void show()
	{
		System.out.println("hi! how are u?");
	}

	public static void main(String[] args) {
		Getclass aobj1=new Getclass();
	    Getclass  aobj2=new Getclass();
	    System.out.println("getclass():"+aobj1.getClass());
	    System.out.println("getclass():"+aobj2.getClass());
//	    System.out.println("getclass():"+new Getclass());
	}
}
/*getclass() method will going to returns FullyQualifiedClassname*/