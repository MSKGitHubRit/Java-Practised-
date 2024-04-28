package objectmethods;

public class Equvalmethod {
	public void show()
	{
		System.out.println("hello");
	}
	public static void main(String args[])
	{
		Equvalmethod aobj1=new Equvalmethod();
		Equvalmethod aobj2=new Equvalmethod();
		System.out.println(aobj1.equals(aobj1));
		System.out.println(aobj2.equals(aobj2));
		System.out.println(aobj1.equals(aobj2)+"\n");
		System.out.println(aobj1.equals(new Equvalmethod()));
		System.out.println(new Equvalmethod().equals(new Equvalmethod()));
		
	}

}
/*
 * equvals method() returns the boolean 
 * equvals() will check the address location of an object
 * if both the address location will be true return true otherwise false.
 * */
