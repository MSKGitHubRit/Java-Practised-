package exceptionhandling;
import java.util.Scanner;

public class ClassA {
	
	//exception handling
	void meth1()
	{
		System.out.println(10);
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("try block exeguated");
			System.out.println("enter a number");
			System.out.println("===>"+20/sc.nextInt());
			//syso(30)//iam not got 30
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch block exeguated");
		}
		finally
		{
			System.out.println("finally block exeguated");
			sc.close();
		}
		System.out.println(30);
	
	}
	public static void main(String[] args) {
		new ClassA().meth1();
	}
	
}


