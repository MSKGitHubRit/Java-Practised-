package java8feautures;
import java.util.ArrayList;
import java.util.stream.Stream;

public class ClassB {
	
	public void m1()
	{
		System.out.println("implementing the count()");
		ArrayList<String>al=new ArrayList<String>();
		al.add("shiva");
		al.add("JOHN");
		al.add("PIKA");
		al.add("Rahul");
		Stream<String>i=al.stream();
		Stream<String>i2=i.filter(data->data.length()<=4);
		long val=i2.count();

		System.out.println(val);
		
		
	}
	public static void main(String[] args) {
		new ClassB().m1();
	}

}
