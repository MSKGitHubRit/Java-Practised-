package java8feautures.assesment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ClassA {
	
	public void show()
	{
		System.out.println("implementing LambdaExpression");
		InterfaceA xobj=(ArrayList<Object>al)->
		{
			System.out.println("reterving data from the ArrayList");
			Iterator i=al.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next()+" ");
			}
			int arr[]= {10,20,30};
			return arr;
		
			
		};
		ArrayList<Object>al=new ArrayList<Object>();
		al.add(101);
		al.add(102);
		al.add(103);
		int num[]=xobj.meth1(al);
//		for(int i=0;i<=num.length-1;i++)
//		{
//			System.out.println(num[i]+" ");
//		}
		System.out.println("Arrays:"+Arrays.toString(num));
		
		
	}
	public static void main(String[] args) {
		new ClassA().show();
	}

}
