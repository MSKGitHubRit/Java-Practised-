package exceptionhandling;
import java.util.Scanner;

public class ClassB {
	
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(10);
		
		try
		{
			System.out.println("try block exeguated");
			System.out.println("enter the number in nextline");
			System.out.println("===>"+20/sc.nextInt());
		}
		catch(Exception e)
		{
			System.out.println("catch block exeguated");
			System.out.println(e.getMessage());//reason of exception
			System.out.println(e.toString());//convert e to string[name+reason]
			e.printStackTrace();//complete information 
		}
		finally
		{
		   System.out.println("finally block exeguated");
		   sc.close();
		}
		System.out.println(30);
	}
	public static void main(String[] args) {
		new ClassB().meth1();
	}

}
