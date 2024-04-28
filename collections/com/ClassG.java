package collections.com;
import java.util.Enumeration;
import java.util.Vector;

public class ClassG {

	public void m1()
	{
		System.out.println("passing userdefined classobject");
		Vector<Object> v=new Vector<Object>();
		ClassF fobj=new ClassF(1,"shaik","Oracle");
		ClassF fobj2=new ClassF(2,"ravi","JAVA");
		v.add(new ClassF(3,"kishan","java"));
		v.add(fobj);
		v.add(fobj2);
		System.out.println(v+" ");
		
		//using enumeration
		Enumeration<Object>e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
	}
	public static void main(String[] args) {
		new ClassG().m1();
	}
}
