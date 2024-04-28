package java8feautures;
import java.util.ArrayList;
import java.util.function.*;
import java.util.stream.Stream;
public class StreamAPI {
	
	public void m1()
	{
		System.out.println("implementing stream API");
		ArrayList<Object>al=new ArrayList<Object>();
		al.add(10);
		al.add(20);
		al.add(30);
//		Stream<Object>i=al.stream();
		al.forEach(data->System.out.println(data));
	}
	public static void main(String[] args) {
		new StreamAPI().m1();
	}

}
